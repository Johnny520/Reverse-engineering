package p332wb;

import android.content.SharedPreferences;
import p071f1.C1034w;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p101h1.InterfaceC1567d;
import p117i0.C1836h0;
import p251r.C3619d;
import p251r.C3623h;
import p266s0.AbstractC3879i;
import p266s0.C3874d;
import p276sf.C3967n;
import p348xb.C5763i;

/* JADX INFO: renamed from: wb.g3 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4901g3 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17327g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f17328h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f17329i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4901g3(Object obj, boolean z9, int i9) {
        this.f17327g = i9;
        this.f17329i = obj;
        this.f17328h = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f17327g) {
            case 0:
                C5763i c5763i = (C5763i) this.f17329i;
                InterfaceC1567d interfaceC1567d = (InterfaceC1567d) obj;
                interfaceC1567d.getClass();
                float fM10455a = c5763i.m10455a();
                InterfaceC1567d.m4087Z(interfaceC1567d, C1034w.m2634b(!this.f17328h ? C1034w.f3258b : C1034w.f3259c, 0.1f), 0L, 1.0f - fM10455a, 0, 118);
                InterfaceC1567d.m4087Z(interfaceC1567d, C1034w.m2634b(C1034w.f3258b, fM10455a * 0.03f), 0L, 0.0f, 0, 126);
                break;
            default:
                final SharedPreferences sharedPreferences = (SharedPreferences) this.f17329i;
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19796j4, 3);
                final int i9 = 0;
                final boolean z9 = this.f17328h;
                C3623h.m7604a(c3623h, null, new C3874d(902745978, new InterfaceC1236q() { // from class: wb.gm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p085fg.InterfaceC1236q
                    /* JADX INFO: renamed from: b */
                    public final Object mo734b(Object obj2, Object obj3, Object obj4) {
                        int i10 = i9;
                        C1836h0 c1836h0 = (C1836h0) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        ((C3619d) obj2).getClass();
                        int i11 = iIntValue & 17;
                        switch (i10) {
                            case 0:
                                if (c1836h0.m4516S(iIntValue & 1, i11 != 16)) {
                                    final int i12 = 1;
                                    final SharedPreferences sharedPreferences2 = sharedPreferences;
                                    final boolean z10 = z9;
                                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-778075463, new InterfaceC1235p() { // from class: wb.gb
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // p085fg.InterfaceC1235p
                                        public final Object invoke(Object obj5, Object obj6) {
                                            switch (i12) {
                                                case 0:
                                                    C1836h0 c1836h02 = (C1836h0) obj5;
                                                    int iIntValue2 = ((Integer) obj6).intValue();
                                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                        SharedPreferences sharedPreferences3 = sharedPreferences2;
                                                        boolean z11 = z10;
                                                        AbstractC4955ho.m9402O3(sharedPreferences3, "voice_forward_favorite_forward_enable", "收藏语音转发", "长按收藏语音后显示转发入口", z11, c1836h02, 28080);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                        AbstractC4955ho.m9402O3(sharedPreferences3, "voice_forward_favorite_save_enable", "收藏语音保存", "长按收藏语音后显示保存入口", z11, c1836h02, 28080);
                                                    } else {
                                                        c1836h02.m4519V();
                                                    }
                                                    break;
                                                default:
                                                    C1836h0 c1836h03 = (C1836h0) obj5;
                                                    int iIntValue3 = ((Integer) obj6).intValue();
                                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        SharedPreferences sharedPreferences4 = sharedPreferences2;
                                                        boolean z12 = z10;
                                                        AbstractC4955ho.m9402O3(sharedPreferences4, "voice_forward_chat_forward_enable", "聊天语音转发", "长按聊天语音后显示转发入口", z12, c1836h03, 28080);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                        AbstractC4955ho.m9402O3(sharedPreferences4, "voice_forward_chat_save_enable", "聊天语音保存", "长按聊天语音后显示保存入口", z12, c1836h03, 28080);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                        AbstractC4955ho.m9402O3(sharedPreferences4, "voice_forward_chat_multi_forward_enable", "多选语音转发", "多选语音后显示逐条转发入口", z12, c1836h03, 28080);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                        AbstractC4955ho.m9402O3(sharedPreferences4, "voice_forward_chat_multi_merge_enable", "多选语音合并", "多选语音后合成为一条语音，可转发或保存为 MP3", false, c1836h03, 28080);
                                                    } else {
                                                        c1836h03.m4519V();
                                                    }
                                                    break;
                                            }
                                            return C3967n.f12976a;
                                        }
                                    }, c1836h0), c1836h0, 48, 1);
                                } else {
                                    c1836h0.m4519V();
                                }
                                break;
                            default:
                                if (c1836h0.m4516S(iIntValue & 1, i11 != 16)) {
                                    final int i13 = 0;
                                    final SharedPreferences sharedPreferences3 = sharedPreferences;
                                    final boolean z11 = z9;
                                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(757321207, new InterfaceC1235p() { // from class: wb.gb
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // p085fg.InterfaceC1235p
                                        public final Object invoke(Object obj5, Object obj6) {
                                            switch (i13) {
                                                case 0:
                                                    C1836h0 c1836h02 = (C1836h0) obj5;
                                                    int iIntValue2 = ((Integer) obj6).intValue();
                                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                        SharedPreferences sharedPreferences32 = sharedPreferences3;
                                                        boolean z112 = z11;
                                                        AbstractC4955ho.m9402O3(sharedPreferences32, "voice_forward_favorite_forward_enable", "收藏语音转发", "长按收藏语音后显示转发入口", z112, c1836h02, 28080);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                        AbstractC4955ho.m9402O3(sharedPreferences32, "voice_forward_favorite_save_enable", "收藏语音保存", "长按收藏语音后显示保存入口", z112, c1836h02, 28080);
                                                    } else {
                                                        c1836h02.m4519V();
                                                    }
                                                    break;
                                                default:
                                                    C1836h0 c1836h03 = (C1836h0) obj5;
                                                    int iIntValue3 = ((Integer) obj6).intValue();
                                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        SharedPreferences sharedPreferences4 = sharedPreferences3;
                                                        boolean z12 = z11;
                                                        AbstractC4955ho.m9402O3(sharedPreferences4, "voice_forward_chat_forward_enable", "聊天语音转发", "长按聊天语音后显示转发入口", z12, c1836h03, 28080);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                        AbstractC4955ho.m9402O3(sharedPreferences4, "voice_forward_chat_save_enable", "聊天语音保存", "长按聊天语音后显示保存入口", z12, c1836h03, 28080);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                        AbstractC4955ho.m9402O3(sharedPreferences4, "voice_forward_chat_multi_forward_enable", "多选语音转发", "多选语音后显示逐条转发入口", z12, c1836h03, 28080);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                        AbstractC4955ho.m9402O3(sharedPreferences4, "voice_forward_chat_multi_merge_enable", "多选语音合并", "多选语音后合成为一条语音，可转发或保存为 MP3", false, c1836h03, 28080);
                                                    } else {
                                                        c1836h03.m4519V();
                                                    }
                                                    break;
                                            }
                                            return C3967n.f12976a;
                                        }
                                    }, c1836h0), c1836h0, 48, 1);
                                } else {
                                    c1836h0.m4519V();
                                }
                                break;
                        }
                        return C3967n.f12976a;
                    }
                }, true), 3);
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19804k4, 3);
                final int i10 = 1;
                C3623h.m7604a(c3623h, null, new C3874d(-1856824648, new InterfaceC1236q() { // from class: wb.gm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p085fg.InterfaceC1236q
                    /* JADX INFO: renamed from: b */
                    public final Object mo734b(Object obj2, Object obj3, Object obj4) {
                        int i102 = i10;
                        C1836h0 c1836h0 = (C1836h0) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        ((C3619d) obj2).getClass();
                        int i11 = iIntValue & 17;
                        switch (i102) {
                            case 0:
                                if (c1836h0.m4516S(iIntValue & 1, i11 != 16)) {
                                    final int i12 = 1;
                                    final SharedPreferences sharedPreferences2 = sharedPreferences;
                                    final boolean z10 = z9;
                                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-778075463, new InterfaceC1235p() { // from class: wb.gb
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // p085fg.InterfaceC1235p
                                        public final Object invoke(Object obj5, Object obj6) {
                                            switch (i12) {
                                                case 0:
                                                    C1836h0 c1836h02 = (C1836h0) obj5;
                                                    int iIntValue2 = ((Integer) obj6).intValue();
                                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                        SharedPreferences sharedPreferences32 = sharedPreferences2;
                                                        boolean z112 = z10;
                                                        AbstractC4955ho.m9402O3(sharedPreferences32, "voice_forward_favorite_forward_enable", "收藏语音转发", "长按收藏语音后显示转发入口", z112, c1836h02, 28080);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                        AbstractC4955ho.m9402O3(sharedPreferences32, "voice_forward_favorite_save_enable", "收藏语音保存", "长按收藏语音后显示保存入口", z112, c1836h02, 28080);
                                                    } else {
                                                        c1836h02.m4519V();
                                                    }
                                                    break;
                                                default:
                                                    C1836h0 c1836h03 = (C1836h0) obj5;
                                                    int iIntValue3 = ((Integer) obj6).intValue();
                                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        SharedPreferences sharedPreferences4 = sharedPreferences2;
                                                        boolean z12 = z10;
                                                        AbstractC4955ho.m9402O3(sharedPreferences4, "voice_forward_chat_forward_enable", "聊天语音转发", "长按聊天语音后显示转发入口", z12, c1836h03, 28080);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                        AbstractC4955ho.m9402O3(sharedPreferences4, "voice_forward_chat_save_enable", "聊天语音保存", "长按聊天语音后显示保存入口", z12, c1836h03, 28080);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                        AbstractC4955ho.m9402O3(sharedPreferences4, "voice_forward_chat_multi_forward_enable", "多选语音转发", "多选语音后显示逐条转发入口", z12, c1836h03, 28080);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                        AbstractC4955ho.m9402O3(sharedPreferences4, "voice_forward_chat_multi_merge_enable", "多选语音合并", "多选语音后合成为一条语音，可转发或保存为 MP3", false, c1836h03, 28080);
                                                    } else {
                                                        c1836h03.m4519V();
                                                    }
                                                    break;
                                            }
                                            return C3967n.f12976a;
                                        }
                                    }, c1836h0), c1836h0, 48, 1);
                                } else {
                                    c1836h0.m4519V();
                                }
                                break;
                            default:
                                if (c1836h0.m4516S(iIntValue & 1, i11 != 16)) {
                                    final int i13 = 0;
                                    final SharedPreferences sharedPreferences3 = sharedPreferences;
                                    final boolean z11 = z9;
                                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(757321207, new InterfaceC1235p() { // from class: wb.gb
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // p085fg.InterfaceC1235p
                                        public final Object invoke(Object obj5, Object obj6) {
                                            switch (i13) {
                                                case 0:
                                                    C1836h0 c1836h02 = (C1836h0) obj5;
                                                    int iIntValue2 = ((Integer) obj6).intValue();
                                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                        SharedPreferences sharedPreferences32 = sharedPreferences3;
                                                        boolean z112 = z11;
                                                        AbstractC4955ho.m9402O3(sharedPreferences32, "voice_forward_favorite_forward_enable", "收藏语音转发", "长按收藏语音后显示转发入口", z112, c1836h02, 28080);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                        AbstractC4955ho.m9402O3(sharedPreferences32, "voice_forward_favorite_save_enable", "收藏语音保存", "长按收藏语音后显示保存入口", z112, c1836h02, 28080);
                                                    } else {
                                                        c1836h02.m4519V();
                                                    }
                                                    break;
                                                default:
                                                    C1836h0 c1836h03 = (C1836h0) obj5;
                                                    int iIntValue3 = ((Integer) obj6).intValue();
                                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        SharedPreferences sharedPreferences4 = sharedPreferences3;
                                                        boolean z12 = z11;
                                                        AbstractC4955ho.m9402O3(sharedPreferences4, "voice_forward_chat_forward_enable", "聊天语音转发", "长按聊天语音后显示转发入口", z12, c1836h03, 28080);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                        AbstractC4955ho.m9402O3(sharedPreferences4, "voice_forward_chat_save_enable", "聊天语音保存", "长按聊天语音后显示保存入口", z12, c1836h03, 28080);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                        AbstractC4955ho.m9402O3(sharedPreferences4, "voice_forward_chat_multi_forward_enable", "多选语音转发", "多选语音后显示逐条转发入口", z12, c1836h03, 28080);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                        AbstractC4955ho.m9402O3(sharedPreferences4, "voice_forward_chat_multi_merge_enable", "多选语音合并", "多选语音后合成为一条语音，可转发或保存为 MP3", false, c1836h03, 28080);
                                                    } else {
                                                        c1836h03.m4519V();
                                                    }
                                                    break;
                                            }
                                            return C3967n.f12976a;
                                        }
                                    }, c1836h0), c1836h0, 48, 1);
                                } else {
                                    c1836h0.m4519V();
                                }
                                break;
                        }
                        return C3967n.f12976a;
                    }
                }, true), 3);
                break;
        }
        return C3967n.f12976a;
    }
}
