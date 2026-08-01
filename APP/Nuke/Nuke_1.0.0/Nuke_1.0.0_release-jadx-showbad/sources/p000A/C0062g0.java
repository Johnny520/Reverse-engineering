package p000A;

import android.view.KeyEvent;
import p273z0.AbstractC3508a;
import p273z0.AbstractC3510c;

/* JADX INFO: renamed from: A.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0062g0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f291a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [A.k0.<clinit>():void] */
    public /* synthetic */ C0062g0(int i5) {
        this.f291a = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ae, code lost:
    
        if (p273z0.AbstractC3508a.m5762a(p273z0.AbstractC3510c.m5763a(r12.getKeyCode()), p273z0.AbstractC3508a.f10939o) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0287, code lost:
    
        if (p273z0.AbstractC3508a.m5762a(r5, p273z0.AbstractC3508a.f10948x) != false) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EnumC0060f0 m60a(KeyEvent keyEvent) {
        EnumC0060f0 enumC0060f0;
        int i5 = this.f291a;
        EnumC0060f0 enumC0060f02 = EnumC0060f0.f255S;
        EnumC0060f0 enumC0060f03 = EnumC0060f0.f254R;
        EnumC0060f0 enumC0060f04 = EnumC0060f0.f284y;
        switch (i5) {
            case 0:
                int i6 = C0064h0.f294k;
                boolean zIsCtrlPressed = keyEvent.isCtrlPressed();
                EnumC0060f0 enumC0060f05 = EnumC0060f0.f262Z;
                if (!zIsCtrlPressed || !keyEvent.isShiftPressed()) {
                    boolean zIsCtrlPressed2 = keyEvent.isCtrlPressed();
                    EnumC0060f0 enumC0060f06 = EnumC0060f0.f281v;
                    EnumC0060f0 enumC0060f07 = EnumC0060f0.f283x;
                    EnumC0060f0 enumC0060f08 = EnumC0060f0.f282w;
                    if (zIsCtrlPressed2) {
                        long jM5764b = AbstractC3510c.m5764b(keyEvent);
                        if (!AbstractC3508a.m5762a(jM5764b, AbstractC3508a.f10934j) && !AbstractC3508a.m5762a(jM5764b, AbstractC3508a.f10948x)) {
                            if (!AbstractC3508a.m5762a(jM5764b, AbstractC3508a.f10936l)) {
                                if (!AbstractC3508a.m5762a(jM5764b, AbstractC3508a.f10937m)) {
                                    if (AbstractC3508a.m5762a(jM5764b, AbstractC3508a.f10933i)) {
                                        return EnumC0060f0.f241E;
                                    }
                                    if (!AbstractC3508a.m5762a(jM5764b, AbstractC3508a.f10938n)) {
                                        if (AbstractC3508a.m5762a(jM5764b, AbstractC3508a.f10939o)) {
                                            return EnumC0060f0.f261Y;
                                        }
                                        return null;
                                    }
                                    return enumC0060f05;
                                }
                                return enumC0060f07;
                            }
                            return enumC0060f08;
                        }
                        return enumC0060f06;
                    }
                    if (!keyEvent.isCtrlPressed()) {
                        if (!keyEvent.isShiftPressed()) {
                            long jM5763a = AbstractC3510c.m5763a(keyEvent.getKeyCode());
                            if (AbstractC3508a.m5762a(jM5763a, AbstractC3508a.f10930f)) {
                                return EnumC0060f0.f264e;
                            }
                            if (AbstractC3508a.m5762a(jM5763a, AbstractC3508a.f10931g)) {
                                return EnumC0060f0.f265f;
                            }
                            if (AbstractC3508a.m5762a(jM5763a, AbstractC3508a.f10928d)) {
                                return EnumC0060f0.f274o;
                            }
                            if (AbstractC3508a.m5762a(jM5763a, AbstractC3508a.f10929e)) {
                                return EnumC0060f0.f275p;
                            }
                            if (AbstractC3508a.m5762a(jM5763a, AbstractC3508a.f10932h)) {
                                return EnumC0060f0.f276q;
                            }
                            if (AbstractC3508a.m5762a(jM5763a, AbstractC3508a.f10921C)) {
                                return EnumC0060f0.f277r;
                            }
                            if (AbstractC3508a.m5762a(jM5763a, AbstractC3508a.f10922D)) {
                                return EnumC0060f0.f278s;
                            }
                            if (AbstractC3508a.m5762a(jM5763a, AbstractC3508a.f10946v)) {
                                return EnumC0060f0.f270k;
                            }
                            if (AbstractC3508a.m5762a(jM5763a, AbstractC3508a.f10947w)) {
                                return EnumC0060f0.f271l;
                            }
                            if (AbstractC3508a.m5762a(jM5763a, AbstractC3508a.f10942r) || AbstractC3508a.m5762a(jM5763a, AbstractC3508a.f10923E)) {
                                return EnumC0060f0.f259W;
                            }
                            if (AbstractC3508a.m5762a(jM5763a, AbstractC3508a.f10943s)) {
                                return enumC0060f04;
                            }
                            if (AbstractC3508a.m5762a(jM5763a, AbstractC3508a.f10944t)) {
                                return EnumC0060f0.f285z;
                            }
                            if (!AbstractC3508a.m5762a(jM5763a, AbstractC3508a.f10919A)) {
                                if (!AbstractC3508a.m5762a(jM5763a, AbstractC3508a.f10949y)) {
                                    if (!AbstractC3508a.m5762a(jM5763a, AbstractC3508a.f10950z)) {
                                        if (AbstractC3508a.m5762a(jM5763a, AbstractC3508a.f10940p)) {
                                            return EnumC0060f0.f260X;
                                        }
                                    }
                                    return enumC0060f06;
                                }
                                return enumC0060f07;
                            }
                            return enumC0060f08;
                        }
                        long jM5763a2 = AbstractC3510c.m5763a(keyEvent.getKeyCode());
                        if (AbstractC3508a.m5762a(jM5763a2, AbstractC3508a.f10930f)) {
                            return EnumC0060f0.f242F;
                        }
                        if (AbstractC3508a.m5762a(jM5763a2, AbstractC3508a.f10931g)) {
                            return EnumC0060f0.f243G;
                        }
                        if (AbstractC3508a.m5762a(jM5763a2, AbstractC3508a.f10928d)) {
                            return EnumC0060f0.f244H;
                        }
                        if (AbstractC3508a.m5762a(jM5763a2, AbstractC3508a.f10929e)) {
                            return EnumC0060f0.f245I;
                        }
                        if (AbstractC3508a.m5762a(jM5763a2, AbstractC3508a.f10921C)) {
                            return EnumC0060f0.f246J;
                        }
                        if (AbstractC3508a.m5762a(jM5763a2, AbstractC3508a.f10922D)) {
                            return EnumC0060f0.f247K;
                        }
                        if (AbstractC3508a.m5762a(jM5763a2, AbstractC3508a.f10946v)) {
                            return enumC0060f03;
                        }
                        if (AbstractC3508a.m5762a(jM5763a2, AbstractC3508a.f10947w)) {
                            return enumC0060f02;
                        }
                        break;
                    }
                    return null;
                }
                break;
                break;
            default:
                if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
                    long jM5763a3 = AbstractC3510c.m5763a(keyEvent.getKeyCode());
                    if (AbstractC3508a.m5762a(jM5763a3, AbstractC3508a.f10930f)) {
                        enumC0060f0 = EnumC0060f0.f256T;
                    } else if (AbstractC3508a.m5762a(jM5763a3, AbstractC3508a.f10931g)) {
                        enumC0060f0 = EnumC0060f0.f257U;
                    } else if (AbstractC3508a.m5762a(jM5763a3, AbstractC3508a.f10928d)) {
                        enumC0060f0 = EnumC0060f0.f248L;
                    } else if (AbstractC3508a.m5762a(jM5763a3, AbstractC3508a.f10929e)) {
                        enumC0060f0 = EnumC0060f0.f249M;
                    }
                } else if (keyEvent.isAltPressed()) {
                    long jM5763a4 = AbstractC3510c.m5763a(keyEvent.getKeyCode());
                    enumC0060f0 = AbstractC3508a.m5762a(jM5763a4, AbstractC3508a.f10930f) ? EnumC0060f0.f272m : AbstractC3508a.m5762a(jM5763a4, AbstractC3508a.f10931g) ? EnumC0060f0.f273n : AbstractC3508a.m5762a(jM5763a4, AbstractC3508a.f10928d) ? EnumC0060f0.f279t : AbstractC3508a.m5762a(jM5763a4, AbstractC3508a.f10929e) ? EnumC0060f0.f280u : null;
                }
                if (enumC0060f0 != null) {
                    return enumC0060f0;
                }
                C0066i0 c0066i0 = AbstractC0068j0.f299a;
                c0066i0.getClass();
                if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                    long jM5763a5 = AbstractC3510c.m5763a(keyEvent.getKeyCode());
                    if (AbstractC3508a.m5762a(jM5763a5, AbstractC3508a.f10930f)) {
                        enumC0060f02 = EnumC0060f0.f250N;
                    } else if (AbstractC3508a.m5762a(jM5763a5, AbstractC3508a.f10931g)) {
                        enumC0060f02 = EnumC0060f0.f251O;
                    } else if (AbstractC3508a.m5762a(jM5763a5, AbstractC3508a.f10928d)) {
                        enumC0060f02 = EnumC0060f0.f253Q;
                    } else if (AbstractC3508a.m5762a(jM5763a5, AbstractC3508a.f10929e)) {
                        enumC0060f02 = EnumC0060f0.f252P;
                    }
                } else if (keyEvent.isCtrlPressed()) {
                    long jM5763a6 = AbstractC3510c.m5763a(keyEvent.getKeyCode());
                    enumC0060f02 = AbstractC3508a.m5762a(jM5763a6, AbstractC3508a.f10930f) ? EnumC0060f0.f267h : AbstractC3508a.m5762a(jM5763a6, AbstractC3508a.f10931g) ? EnumC0060f0.f266g : AbstractC3508a.m5762a(jM5763a6, AbstractC3508a.f10928d) ? EnumC0060f0.f269j : AbstractC3508a.m5762a(jM5763a6, AbstractC3508a.f10929e) ? EnumC0060f0.f268i : AbstractC3508a.m5762a(jM5763a6, AbstractC3508a.f10935k) ? enumC0060f04 : AbstractC3508a.m5762a(jM5763a6, AbstractC3508a.f10944t) ? EnumC0060f0.f238B : AbstractC3508a.m5762a(jM5763a6, AbstractC3508a.f10943s) ? EnumC0060f0.f237A : AbstractC3508a.m5762a(jM5763a6, AbstractC3508a.f10920B) ? EnumC0060f0.f258V : null;
                } else if (keyEvent.isShiftPressed()) {
                    long jM5763a7 = AbstractC3510c.m5763a(keyEvent.getKeyCode());
                    if (AbstractC3508a.m5762a(jM5763a7, AbstractC3508a.f10946v)) {
                        enumC0060f02 = enumC0060f03;
                    } else if (!AbstractC3508a.m5762a(jM5763a7, AbstractC3508a.f10947w)) {
                    }
                } else if (keyEvent.isAltPressed()) {
                    long jM5763a8 = AbstractC3510c.m5763a(keyEvent.getKeyCode());
                    if (AbstractC3508a.m5762a(jM5763a8, AbstractC3508a.f10943s)) {
                        enumC0060f02 = EnumC0060f0.f239C;
                    } else if (AbstractC3508a.m5762a(jM5763a8, AbstractC3508a.f10944t)) {
                        enumC0060f02 = EnumC0060f0.f240D;
                    }
                }
                return enumC0060f02 == null ? ((C0062g0) c0066i0.f297e).m60a(keyEvent) : enumC0060f02;
        }
    }
}
