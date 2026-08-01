// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import android.util.Pair;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS38.CLS37;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS466;
import b.ﾞˎ.CLS528;

public final class CLS711 implements CLS37 {
    public final int FLD840;
    public final CLS877 FLD841;

    public CLS711(CLS877 ﹶﾞ0, int v) {
        this.FLD840 = v;
        this.FLD841 = ﹶﾞ0;
        super();
    }

    // 去混淆评级： 低(27)
    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS38$CLS37
    public final Object MTH1108(Object[] arr_object) {
        String s3;
        String s2;
        CLS877 ﹶﾞ0 = this.FLD841;
        switch(this.FLD840) {
            case 0: {
                ﹶﾞ0.getClass();
                return !ﹶﾞ0.FLD1445.MTH938("clear_failed_comments_shortcut", false) && CLS27.MTH890("SnsAsyncQueueMgr_removeAllErrorComments") ? null : Pair.create(CLS27.MTH889("clear_failed_comments"), "clear_failed_comments");
            }
            case 1: {
                ﹶﾞ0.getClass();
                return ﹶﾞ0.FLD1445.MTH938("mass_del_sns_shortcut", false) ? Pair.create(CLS27.MTH889("mass_del_sns"), "mass_del_sns") : null;
            }
            case 2: {
                ﹶﾞ0.getClass();
                return !ﹶﾞ0.FLD1445.MTH938("mass_like_sns_shortcut", false) || !ﹶﾞ0.FLD1447.FLD1438.MTH6895("mass_sns_like") ? null : Pair.create(CLS27.MTH889("mass_like_sns"), "mass_like_sns");
            }
            case 3: {
                ﹶﾞ0.getClass();
                return !ﹶﾞ0.FLD1445.MTH938("moments_container_enable", false) || !ﹶﾞ0.FLD1447.FLD1438.MTH6895("moments_container_enable") ? null : Pair.create(CLS27.MTH889("moments_container_enable"), "moments_container");
            }
            case 4: {
                ﹶﾞ0.getClass();
                return !ﹶﾞ0.FLD1445.MTH938("mass_export_sns_shortcut", false) || !ﹶﾞ0.FLD1447.FLD1438.MTH6895("sns_export") ? null : Pair.create(CLS27.MTH889("mass_export_sns"), "mass_export_sns");
            }
            case 5: {
                ﹶﾞ0.getClass();
                boolean z = CLS412.MTH6002();
                return !ﹶﾞ0.FLD1445.MTH938("send_external_video_shortcut", z) || CLS182.MTH3470(0x38EDE5702B3CD335L) || !ﹶﾞ0.FLD1447.FLD1438.MTH6895("sns_external_video") ? null : Pair.create(CLS27.MTH889("send_external_video"), "send_external_video");
            }
            case 6: {
                ﹶﾞ0.getClass();
                return !ﹶﾞ0.FLD1445.MTH938("mass_repeat_sns_shortcut", false) || !ﹶﾞ0.FLD1447.FLD1438.MTH6895("mass_repeat_sns") ? null : Pair.create(CLS27.MTH889("mass_repeat_sns"), "mass_repeat_sns");
            }
            case 7: {
                ﹶﾞ0.getClass();
                return !ﹶﾞ0.FLD1445.MTH938("post_auto_clean_moment_shortcut", false) || !ﹶﾞ0.FLD1447.FLD1438.MTH6895("auto_clean_moment") ? null : Pair.create(CLS27.MTH889("post_auto_clean_moment"), "post_auto_clean_moment");
            }
            case 8: {
                ﹶﾞ0.getClass();
                if(!TextUtils.isEmpty(CLS27.MTH897("SnsInfoClass2")) && ﹶﾞ0.FLD1445.MTH938("fake_moment_forward_enable", false) && ﹶﾞ0.FLD1447.FLD1438.MTH6895("fake_moment_forward")) {
                    CLS528 ʽי1 = new CLS528();
                    ʽי1.FLD5167 = "15";
                    ʽי1.FLD5165 = "fake_moment_forward";
                    String s = CLS27.MTH889("fake_moment_forward_enable");
                    String s1 = "";
                    new String("");
                    new String("");
                    new String("");
                    if(!TextUtils.isEmpty(s)) {
                        if(!s.contains("[[") || !s.contains("]]")) {
                            s2 = "";
                            s3 = s;
                        }
                        else {
                            int v = s.indexOf("[[");
                            int v1 = s.lastIndexOf("]]");
                            s2 = s.substring(v + 2, v1);
                            s3 = CLS182.MTH3495(s, 0, v, new StringBuilder(), v1, 2);
                        }
                        String s4 = "";
                        if(s3.contains("{") && s3.contains("}")) {
                            int v2 = s3.indexOf("{");
                            int v3 = s3.lastIndexOf("}");
                            String s5 = s3.substring(v2 + 1, v3);
                            s3 = CLS182.MTH3495(s3, 0, v2, new StringBuilder(), v3, 1);
                            s4 = s5;
                        }
                        String s6 = s3;
                        String s7 = "";
                        if(s6.contains("((") && s6.contains("))")) {
                            int v4 = s6.indexOf("((");
                            int v5 = s6.lastIndexOf("))");
                            s7 = s6.substring(v4 + 2, v5);
                            s6 = CLS182.MTH3495(s6, 0, v4, new StringBuilder(), v5, 2);
                        }
                        s4.getClass();
                        s2.getClass();
                        s7.getClass();
                        s1 = s6.trim();
                    }
                    return Pair.create(s1, "");
                }
                return null;
            }
            case 9: {
                ﹶﾞ0.getClass();
                if(!TextUtils.isEmpty(CLS27.MTH897("SnsInfoClass2")) && ﹶﾞ0.FLD1445.MTH938("mass_repeat_sns_enable", false) && ﹶﾞ0.FLD1447.FLD1438.MTH6895("mass_repeat_sns")) {
                    CLS528 ʽי2 = new CLS528();
                    ʽי2.FLD5167 = "17";
                    ʽי2.FLD5165 = "mass_repeat_sns";
                    return Pair.create(CLS27.MTH889("mass_repeat_sns"), "");
                }
                return null;
            }
            case 10: {
                if(!ﹶﾞ0.FLD1447.FLD1407.MTH5947("other")) {
                    CLS29 ˎᵢ0 = ﹶﾞ0.FLD1445;
                    if(ˎᵢ0.MTH938("self_like_enable", false)) {
                        CLS528 ʽי3 = new CLS528();
                        ʽי3.FLD5167 = "9";
                        ʽי3.FLD5165 = "sns_selflike";
                        return Pair.create(CLS182.MTH3473(0x38EDEF2A2B3CD335L, ˎᵢ0, "sns_fakelike"), "");
                    }
                }
                return null;
            }
            case 11: {
                ﹶﾞ0.getClass();
                CLS29 ˎᵢ1 = ﹶﾞ0.FLD1445;
                if(ˎᵢ1.MTH938("fake_comments_enable", false) && !ﹶﾞ0.FLD1447.FLD1407.MTH5947("other")) {
                    CLS528 ʽי4 = new CLS528();
                    ʽי4.FLD5167 = "10";
                    ʽי4.FLD5165 = "sns_fake_comments";
                    return Pair.create(CLS182.MTH3473(4102198053400531765L, ˎᵢ1, "sns_fakecomments"), "");
                }
                return null;
            }
            case 12: {
                ﹶﾞ0.getClass();
                if(ﹶﾞ0.FLD1445.MTH938("sns_block_enable", false)) {
                    CLS528 ʽי5 = new CLS528();
                    ʽי5.FLD5167 = "11";
                    ʽי5.FLD5165 = "sns_block_enable";
                    return CLS466.MTH6511(((long)(((Long)arr_object[0])))).equals(CLS27.MTH904()) ? Pair.create(CLS27.MTH889("set_private"), "") : Pair.create(CLS27.MTH889("sns_block_enable"), "");
                }
                return null;
            }
            case 13: {
                ﹶﾞ0.getClass();
                if(ﹶﾞ0.FLD1445.MTH938("moments_container_enable", false) && ﹶﾞ0.FLD1447.FLD1438.MTH6895("moments_container_enable")) {
                    CLS528 ʽי6 = new CLS528();
                    ʽי6.FLD5167 = "16";
                    ʽי6.FLD5165 = "add_to_moments_container";
                    return Pair.create(CLS27.MTH889("add_to_moments_container"), "");
                }
                return null;
            }
            default: {
                if(ﹶﾞ0.FLD1447.FLD1438.MTH6895("moment_schedule_forward") && CLS27.MTH899(new String[]{"mmsnspostClass", "mmsnspostClass_b"}) && ﹶﾞ0.FLD1445.MTH938("moments_schedule_forward", true)) {
                    CLS528 ʽי0 = new CLS528();
                    ʽי0.FLD5167 = "3";
                    ʽי0.FLD5165 = "moments_schedule_forward";
                    return Pair.create(CLS27.MTH889("moments_schedule_forward"), "");
                }
                return null;
            }
        }
    }
}

