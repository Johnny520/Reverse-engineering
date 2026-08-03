package Yue;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: Yue.ۥ۠۠۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4519 {

    /* JADX INFO: renamed from: ۥ */
    public final View f939;

    /* JADX INFO: renamed from: ۥ۟ */
    public final InterfaceC0423 f940;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f9629;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f9630;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f9631;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final View.OnLongClickListener f9632 = new View.OnLongClickListener() { // from class: Yue.ۥ۠۠۠ۢ
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return this.f9627.m13222(view);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final View.OnTouchListener f9633 = new View.OnTouchListener() { // from class: Yue.ۥۣ۠۠۠
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return this.f9628.m13223(view, motionEvent);
        }
    };

    /* JADX INFO: renamed from: Yue.ۥ۠۠۠ۤ$ۥ */
    public interface InterfaceC0423 {
        /* JADX INFO: renamed from: ۥ */
        boolean m1445(@InterfaceC6391 View view, @InterfaceC6391 C4519 c4519);
    }

    public C4519(@InterfaceC6391 View view, @InterfaceC6391 InterfaceC0423 interfaceC0423) {
        this.f939 = view;
        this.f940 = interfaceC0423;
    }

    /* JADX INFO: renamed from: ۥ */
    public void m1443() {
        this.f939.setOnLongClickListener(this.f9632);
        this.f939.setOnTouchListener(this.f9633);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m1444() {
        this.f939.setOnLongClickListener(null);
        this.f939.setOnTouchListener(null);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m13221(@InterfaceC6391 Point point) {
        point.set(this.f9629, this.f9630);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m13222(@InterfaceC6391 View view) {
        if (this.f9631) {
            return true;
        }
        boolean zM1445 = this.f940.m1445(view, this);
        this.f9631 = zM1445;
        return zM1445;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m13223(@InterfaceC6391 View view, @InterfaceC6391 MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f9629 = x;
            this.f9630 = y;
        } else if (action == 1) {
            this.f9631 = false;
        } else if (action != 2) {
            if (action == 3) {
            }
        } else if (C6270.m19351(motionEvent, 8194) && (motionEvent.getButtonState() & 1) != 0 && !this.f9631 && (this.f9629 != x || this.f9630 != y)) {
            this.f9629 = x;
            this.f9630 = y;
            boolean zM1445 = this.f940.m1445(view, this);
            this.f9631 = zM1445;
            return zM1445;
        }
        return false;
    }
}
