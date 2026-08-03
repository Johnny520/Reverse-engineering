package vg;

import android.os.Trace;
import bi.AbstractC0316d;
import bi.C0314b;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1866o2;
import p117i0.C1836h0;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p276sf.C3967n;
import p321w.C4609j1;
import p332wb.AbstractC4955ho;
import p343x6.AbstractC5700d;
import p356y0.C5850l;
import sh.AbstractC4045s;
import wf.InterfaceC5559e;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: vg.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4571t implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f15056g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [vg.a.<clinit>():void, w.j1.<clinit>():void, wb.p0.<clinit>():void] */
    public /* synthetic */ C4571t(int i9) {
        this.f15056g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15056g) {
            case 0:
                InterfaceC5559e interfaceC5559e = (InterfaceC5559e) obj2;
                if (interfaceC5559e instanceof AbstractC1866o2) {
                }
                break;
            case 1:
                C4573v c4573v = (C4573v) obj;
                InterfaceC5559e interfaceC5559e2 = (InterfaceC5559e) obj2;
                if (interfaceC5559e2 instanceof AbstractC1866o2) {
                    InterfaceC5561g interfaceC5561g = c4573v.f15059a;
                    Trace.beginSection(null);
                    Object[] objArr = c4573v.f15060b;
                    int i9 = c4573v.f15062d;
                    objArr[i9] = C3967n.f12976a;
                    AbstractC1866o2[] abstractC1866o2Arr = c4573v.f15061c;
                    c4573v.f15062d = i9 + 1;
                    abstractC1866o2Arr[i9] = (AbstractC1866o2) interfaceC5559e2;
                }
                break;
            case 2:
                C4609j1 c4609j1 = (C4609j1) obj2;
                break;
            case 3:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC4955ho.m9657s0("正在载入会话...", c1836h0, 6);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 4:
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("没有匹配的会话", c1836h02, 6);
                } else {
                    c1836h02.m4519V();
                }
                break;
            case 5:
                C1836h0 c1836h03 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("正在载入监听群...", c1836h03, 6);
                } else {
                    c1836h03.m4519V();
                }
                break;
            case 6:
                C1836h0 c1836h04 = (C1836h0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("没有匹配结果", c1836h04, 6);
                } else {
                    c1836h04.m4519V();
                }
                break;
            case 7:
                C1836h0 c1836h05 = (C1836h0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("还没有定时任务，点击底部“新增任务”。", c1836h05, 6);
                } else {
                    c1836h05.m4519V();
                }
                break;
            case 8:
                C1836h0 c1836h06 = (C1836h0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    AbstractC4045s.m8250n("社区插件由用户上传，安装前请核对作者、说明和文件内容。下载后的插件默认禁用。", AbstractC3208d.m6883m(AbstractC3222h1.m6901d(C5850l.f23787a, 1.0f), 16, 14), ((C0314b) c1836h06.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(13), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h06, 24630, 0, 262120);
                } else {
                    c1836h06.m4519V();
                }
                break;
            case 9:
                C1836h0 c1836h07 = (C1836h0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("正在加载在线插件...", c1836h07, 6);
                } else {
                    c1836h07.m4519V();
                }
                break;
            case 10:
                C1836h0 c1836h08 = (C1836h0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c1836h08.m4516S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("暂无模型列表，先点击“拉取模型列表”。", c1836h08, 6);
                } else {
                    c1836h08.m4519V();
                }
                break;
            case 11:
                C1836h0 c1836h09 = (C1836h0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c1836h09.m4516S(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("正在载入列表...", c1836h09, 6);
                } else {
                    c1836h09.m4519V();
                }
                break;
            case 12:
                C1836h0 c1836h010 = (C1836h0) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c1836h010.m4516S(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("没有匹配标签", c1836h010, 6);
                } else {
                    c1836h010.m4519V();
                }
                break;
            case 13:
                C1836h0 c1836h011 = (C1836h0) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (c1836h011.m4516S(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("没有匹配结果", c1836h011, 6);
                } else {
                    c1836h011.m4519V();
                }
                break;
            case 14:
                C1836h0 c1836h012 = (C1836h0) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (c1836h012.m4516S(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("正在载入列表...", c1836h012, 6);
                } else {
                    c1836h012.m4519V();
                }
                break;
            case 15:
                C1836h0 c1836h013 = (C1836h0) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (c1836h013.m4516S(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("没有匹配结果", c1836h013, 6);
                } else {
                    c1836h013.m4519V();
                }
                break;
            case 16:
                C1836h0 c1836h014 = (C1836h0) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (c1836h014.m4516S(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("正在载入收藏...", c1836h014, 6);
                } else {
                    c1836h014.m4519V();
                }
                break;
            case 17:
                C1836h0 c1836h015 = (C1836h0) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (c1836h015.m4516S(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("正在后台查找收藏...", c1836h015, 6);
                } else {
                    c1836h015.m4519V();
                }
                break;
            case 18:
                C1836h0 c1836h016 = (C1836h0) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (c1836h016.m4516S(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("正在后台加载更多收藏...", c1836h016, 6);
                } else {
                    c1836h016.m4519V();
                }
                break;
            case 19:
                C1836h0 c1836h017 = (C1836h0) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (c1836h017.m4516S(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("正在载入群聊...", c1836h017, 6);
                } else {
                    c1836h017.m4519V();
                }
                break;
            case 20:
                C1836h0 c1836h018 = (C1836h0) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (c1836h018.m4516S(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("正在载入群成员...", c1836h018, 6);
                } else {
                    c1836h018.m4519V();
                }
                break;
            case 21:
                C1836h0 c1836h019 = (C1836h0) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (c1836h019.m4516S(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("暂无会话规则，点击底部“添加会话”。", c1836h019, 6);
                } else {
                    c1836h019.m4519V();
                }
                break;
            case 22:
                C1836h0 c1836h020 = (C1836h0) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (c1836h020.m4516S(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("没有匹配结果", c1836h020, 6);
                } else {
                    c1836h020.m4519V();
                }
                break;
            case 23:
                C1836h0 c1836h021 = (C1836h0) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (c1836h021.m4516S(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("这个模块暂时没有可配置项", c1836h021, 6);
                } else {
                    c1836h021.m4519V();
                }
                break;
            case 24:
                C1836h0 c1836h022 = (C1836h0) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (!c1836h022.m4516S(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    c1836h022.m4519V();
                }
                break;
            case 25:
                C1836h0 c1836h023 = (C1836h0) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (c1836h023.m4516S(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("暂无回复步骤。添加后会按列表顺序依次发送。", c1836h023, 6);
                } else {
                    c1836h023.m4519V();
                }
                break;
            case 26:
                C1836h0 c1836h024 = (C1836h0) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (c1836h024.m4516S(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("没有匹配结果", c1836h024, 6);
                } else {
                    c1836h024.m4519V();
                }
                break;
            case 27:
                C1836h0 c1836h025 = (C1836h0) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                if (c1836h025.m4516S(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("只会修改已勾选“应用”的项目，未勾选的设置保持原样。群聊专属的 @ 规则只影响群聊规则。", c1836h025, 6);
                } else {
                    c1836h025.m4519V();
                }
                break;
            case 28:
                C1836h0 c1836h026 = (C1836h0) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                if (c1836h026.m4516S(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("暂无规则", c1836h026, 6);
                } else {
                    c1836h026.m4519V();
                }
                break;
            default:
                C1836h0 c1836h027 = (C1836h0) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                if (c1836h027.m4516S(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("暂无规则", c1836h027, 6);
                } else {
                    c1836h027.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
