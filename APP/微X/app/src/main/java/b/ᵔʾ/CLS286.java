// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.os.Handler;
import android.os.HandlerThread;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS481;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import java.util.ArrayDeque;
import java.util.HashSet;

public final class CLS286 {
    public static final class CLS285 {
        public final String FLD2959;
        public final int FLD2960;

        public CLS285(int v, String s) {
            this.FLD2959 = s;
            this.FLD2960 = v;
        }
    }

    public boolean FLD2961;
    public static final CLS286 FLD2962;
    public final CLS311 FLD2963;
    public HandlerThread FLD2964;
    public final HashSet FLD2965;
    public final CLS311 FLD2966;
    public final ArrayDeque FLD2967;
    public Handler FLD2968;
    public Handler FLD2969;

    static {
        CLS286.FLD2962 = new CLS286();
    }

    public CLS286() {
        this.FLD2961 = false;
        this.FLD2967 = new ArrayDeque();
        this.FLD2963 = new CLS311(this, 0);
        this.FLD2966 = new CLS311(this, 1);
        this.FLD2965 = new HashSet();
    }

    // 此方法包含解密的字符串
    public static void MTH4704(CLS286 ˆʿ0) {
        boolean z1;
        ˆʿ0.getClass();
        try {
            CLS285 ˆʿ$ˆٴ0 = (CLS285)ˆʿ0.FLD2967.poll();
            if(ˆʿ$ˆٴ0 == null) {
                ˆʿ0.MTH4705();
                return;
            }
            String s = ˆʿ$ˆٴ0.FLD2959;
            boolean z = true;
            if(ˆʿ$ˆٴ0.FLD2960 == 0) {
                if(!CLS27.MTH895().MTH938("auto_accept_chatroom_invite_qr_enable", false) || !CLS500.FLD4928.MTH6895("auto_accept_chatroom_invite_qr")) {
                    ˆʿ0.MTH4705();
                    return;
                }
                int v = CLS27.MTH895().MTH927(-1, "auto_accept_chatroom_invite_qr_day_limit_count");
                if(v != -1) {
                    int v1 = CLS481.MTH6691("auto_accept_chatroom_invite_qr_day_limit");
                    CLS481.MTH6694(v1 + 1, "auto_accept_chatroom_invite_qr_day_limit");
                    if(v1 + 1 >= v) {
                        z = false;
                    }
                }
                if(!z) {
                    ˆʿ0.MTH4705();
                    return;
                }
                CLS66.MTH1386(s);
                return;
            }
            if(!CLS27.MTH895().MTH938("auto_accept_chatroom_invite", false) || !CLS500.FLD4928.MTH6895("auto_accept_chatroom_invite") && !CLS500.FLD4928.MTH6895("aa_chatroom_invite")) {
                ˆʿ0.MTH4705();
                return;
            }
            int v2 = CLS27.MTH895().MTH927(-1, "auto_accept_chatroom_invite_day_limit_count");
            if(v2 == -1) {
                z1 = true;
            }
            else {
                int v3 = CLS481.MTH6691("auto_accept_chatroom_invite_day_limit");
                CLS481.MTH6694(v3 + 1, "auto_accept_chatroom_invite_day_limit");
                z1 = v3 + 1 >= v2 ? false : true;
            }
            if(!z1 || !CLS502.MTH6934(s, new String[]{"addchatroombyinvite", "addopenimchatroombyinvite"})) {
                ˆʿ0.MTH4705();
                return;
            }
            if(!CLS502.MTH6934(s, new String[]{"addopenimchatroombyinvite"}) || CLS27.MTH895().MTH938("autojoin_openim_chatroom_enable", false)) {
                CLS66.MTH1514(CLS27.MTH904(), s);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH4705() {
        ArrayDeque arrayDeque0 = this.FLD2967;
        if(((CLS285)arrayDeque0.peek()) == null) {
            arrayDeque0.poll();
            if(!arrayDeque0.isEmpty()) {
                this.MTH4705();
                return;
            }
            this.FLD2961 = false;
            return;
        }
        Handler handler0 = this.FLD2969;
        long v = (long)CLS412.MTH6005(5000, "autojoinchatroom_interval_delay");
        handler0.postDelayed(this.FLD2963, v);
    }

    // 此方法包含解密的字符串
    public final void MTH4706(int v, String s) {
        CLS285 ˆʿ$ˆٴ0 = new CLS285(v, s);
        this.FLD2967.addLast(ˆʿ$ˆٴ0);
        try {
            if(this.FLD2964 == null || !this.FLD2964.isAlive()) {
                HandlerThread handlerThread0 = new HandlerThread(CLS412.MTH5999("wx_chatroom_joiner"));
                this.FLD2964 = handlerThread0;
                CLS412.MTH6000(handlerThread0);
                this.FLD2969 = new Handler(this.FLD2964.getLooper());
                this.FLD2968 = new Handler(this.FLD2964.getLooper());
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        if(!this.FLD2961) {
            this.FLD2961 = true;
            this.MTH4705();
        }
    }
}

