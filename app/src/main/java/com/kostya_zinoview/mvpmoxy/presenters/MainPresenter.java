package com.kostya_zinoview.mvpmoxy.presenters;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.kostya_zinoview.mvpmoxy.R;
import com.kostya_zinoview.mvpmoxy.view.MainView;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {


    public void showMessage(){
        getViewState().showMessage(R.string.app_name);
    }

}
