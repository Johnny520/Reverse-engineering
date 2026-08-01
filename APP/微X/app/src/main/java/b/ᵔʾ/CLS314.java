// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.os.Handler;
import android.os.HandlerThread;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS502;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public final class CLS314 {
    public static final class CLS313 {
        public final String FLD3227;
        public final String FLD3228;
        public final ArrayList FLD3229;

        public CLS313(String s, String s1, ArrayList arrayList0) {
            this.FLD3227 = s;
            this.FLD3229 = arrayList0;
            this.FLD3228 = s1;
        }
    }

    public boolean FLD3230;
    public static final CLS314 FLD3231;
    public final CLS312 FLD3232;
    public HandlerThread FLD3233;
    public final ArrayDeque FLD3234;
    public final CLS291 FLD3235;
    public final ArrayDeque FLD3236;
    public Handler FLD3237;
    public Handler FLD3238;

    static {
        CLS314.FLD3231 = new CLS314();
    }

    public CLS314() {
        public final class CLS312 implements Runnable {
            public final CLS314 FLD3226;

            // 此方法包含解密的字符串
            @Override
            public final void run() {
                try {
                    CLS314 ﾞᐧ0 = CLS314.this;
                    ArrayDeque arrayDeque0 = ﾞᐧ0.FLD3234;
                    if(ﾞᐧ0.FLD3236.isEmpty()) {
                        arrayDeque0.poll();
                        ﾞᐧ0.MTH5005();
                        return;
                    }
                    CLS313 ﾞᐧ$ᵔʾ0 = (CLS313)arrayDeque0.peek();
                    if(ﾞᐧ$ᵔʾ0 == null) {
                        ﾞᐧ0.MTH5005();
                        return;
                    }
                    String s = ﾞᐧ$ᵔʾ0.FLD3227;
                    ArrayList arrayList0 = new ArrayList();
                    int v = CLS412.MTH6005(5, "send_invites_max_members");
                    ArrayDeque arrayDeque1 = ﾞᐧ0.FLD3236;
                    int v1 = Math.min(v, arrayDeque1.size());
                    HashSet hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(CLS371.FLD3470.MTH5335(s))));
                    while(!arrayDeque1.isEmpty()) {
                        String s1 = (String)arrayDeque1.poll();
                        if(!hashSet0.contains(s1)) {
                            arrayList0.add(s1);
                        }
                        if(arrayList0.size() == v1) {
                            break;
                        }
                    }
                    CLS66.MTH1425(s, ﾞᐧ$ᵔʾ0.FLD3228, "wx", arrayList0);
                    if(!arrayDeque0.isEmpty()) {
                        Handler handler0 = ﾞᐧ0.FLD3237;
                        int v2 = CLS412.MTH6005(5000, "send_invites_delay");
                        int v3 = CLS27.MTH879(15000, "send_invites_backup_delay");
                        handler0.postDelayed(ﾞᐧ0.FLD3235, ((long)(v2 + v3)));
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        this.FLD3230 = false;
        this.FLD3234 = new ArrayDeque();
        this.FLD3236 = new ArrayDeque();
        this.FLD3232 = new CLS312(this);
        this.FLD3235 = new CLS291(0, this);
    }

    // 此方法包含解密的字符串
    public final void MTH5001(String s) {
        if(!this.FLD3230) {
            return;
        }
        ArrayDeque arrayDeque0 = this.FLD3234;
        CLS313 ﾞᐧ$ᵔʾ0 = (CLS313)arrayDeque0.peek();
        if(ﾞᐧ$ᵔʾ0 != null && ﾞᐧ$ᵔʾ0.FLD3227.equals(s)) {
            this.FLD3237.removeCallbacks(this.FLD3235);
            if(this.FLD3236.isEmpty()) {
                arrayDeque0.poll();
                this.MTH5005();
                return;
            }
            Handler handler0 = this.FLD3238;
            long v = (long)CLS412.MTH6005(5000, "send_invites_delay");
            handler0.postDelayed(this.FLD3232, v);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH5002() {
        try {
            if(this.FLD3233 == null || !this.FLD3233.isAlive()) {
                HandlerThread handlerThread0 = new HandlerThread(CLS412.MTH5999("wx_chatroom_inviter"));
                this.FLD3233 = handlerThread0;
                CLS412.MTH6000(handlerThread0);
                this.FLD3238 = new Handler(this.FLD3233.getLooper());
                this.FLD3237 = new Handler(this.FLD3233.getLooper());
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        if(this.FLD3230) {
            return;
        }
        this.FLD3230 = true;
        this.MTH5005();
    }

    public final void MTH5003(String s, String s1, ArrayList arrayList0) {
        CLS313 ﾞᐧ$ᵔʾ0 = new CLS313(s, s1, arrayList0);
        this.FLD3234.addLast(ﾞᐧ$ᵔʾ0);
    }

    public final void MTH5004(String s, String s1, String s2) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(s1);
        this.MTH5003(s, s2, arrayList0);
    }

    // 此方法包含解密的字符串
    public final void MTH5005() {
        ArrayDeque arrayDeque0 = this.FLD3234;
        CLS313 ﾞᐧ$ᵔʾ0 = (CLS313)arrayDeque0.peek();
        if(ﾞᐧ$ᵔʾ0 == null) {
            arrayDeque0.poll();
            if(!arrayDeque0.isEmpty()) {
                this.MTH5005();
                return;
            }
            this.FLD3230 = false;
            return;
        }
        this.FLD3236.addAll(ﾞᐧ$ᵔʾ0.FLD3229);
        Handler handler0 = this.FLD3238;
        long v = (long)CLS412.MTH6005(5000, "send_invites_delay");
        handler0.postDelayed(this.FLD3232, v);
    }
}

