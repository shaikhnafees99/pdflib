package com.shaikh.pdflib.subscaleview;

@SuppressWarnings("EmptyMethod")
public interface OnAnimationEventListener {

    void onComplete();

    void onInterruptedByUser();

    void onInterruptedByNewAnim();
}