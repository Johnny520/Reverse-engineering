package p321w;

import android.view.KeyEvent;
import p174m.C2571a;
import p236q1.AbstractC3421a;
import p236q1.AbstractC3424d;

/* JADX INFO: renamed from: w.n0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4620n0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15298a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [w.s.<clinit>():void] */
    public /* synthetic */ C4620n0(int i9) {
        this.f15298a = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x033e, code lost:
    
        if (p236q1.AbstractC3421a.m7196a(r0, p236q1.AbstractC3421a.f11063N) == false) goto L307;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0136  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EnumC4617m0 m9043a(KeyEvent keyEvent) {
        EnumC4617m0 enumC4617m0;
        switch (this.f15298a) {
            case 0:
                int iM9079v = AbstractC4634s.m9079v(keyEvent);
                EnumC4617m0 enumC4617m02 = EnumC4617m0.REDO;
                if (iM9079v != 10) {
                    EnumC4617m0 enumC4617m03 = EnumC4617m0.COPY;
                    EnumC4617m0 enumC4617m04 = EnumC4617m0.CUT;
                    EnumC4617m0 enumC4617m05 = EnumC4617m0.PASTE;
                    if (iM9079v == 2) {
                        long jM7197a = AbstractC3424d.m7197a(keyEvent.getKeyCode());
                        if (!AbstractC3421a.m7196a(jM7197a, AbstractC3421a.f11074j) && !AbstractC3421a.m7196a(jM7197a, AbstractC3421a.f11088x) && !AbstractC3421a.m7196a(jM7197a, AbstractC3421a.f11063N)) {
                            if (!AbstractC3421a.m7196a(jM7197a, AbstractC3421a.f11076l)) {
                                if (!AbstractC3421a.m7196a(jM7197a, AbstractC3421a.f11077m)) {
                                    if (AbstractC3421a.m7196a(jM7197a, AbstractC3421a.f11073i)) {
                                        return EnumC4617m0.SELECT_ALL;
                                    }
                                    if (AbstractC3421a.m7196a(jM7197a, AbstractC3421a.f11078n)) {
                                        return enumC4617m02;
                                    }
                                    if (AbstractC3421a.m7196a(jM7197a, AbstractC3421a.f11079o)) {
                                        return EnumC4617m0.UNDO;
                                    }
                                }
                                return enumC4617m04;
                            }
                            return enumC4617m05;
                        }
                        return enumC4617m03;
                    }
                    if (iM9079v == 8) {
                        long jM7197a2 = AbstractC3424d.m7197a(keyEvent.getKeyCode());
                        if (AbstractC3421a.m7196a(jM7197a2, AbstractC3421a.f11070f) || AbstractC3421a.m7196a(jM7197a2, AbstractC3421a.f11057H)) {
                            return EnumC4617m0.SELECT_LEFT_CHAR;
                        }
                        if (AbstractC3421a.m7196a(jM7197a2, AbstractC3421a.f11071g) || AbstractC3421a.m7196a(jM7197a2, AbstractC3421a.f11058I)) {
                            return EnumC4617m0.SELECT_RIGHT_CHAR;
                        }
                        if (AbstractC3421a.m7196a(jM7197a2, AbstractC3421a.f11068d) || AbstractC3421a.m7196a(jM7197a2, AbstractC3421a.f11055F)) {
                            return EnumC4617m0.SELECT_UP;
                        }
                        if (AbstractC3421a.m7196a(jM7197a2, AbstractC3421a.f11069e) || AbstractC3421a.m7196a(jM7197a2, AbstractC3421a.f11056G)) {
                            return EnumC4617m0.SELECT_DOWN;
                        }
                        if (AbstractC3421a.m7196a(jM7197a2, AbstractC3421a.f11052C) || AbstractC3421a.m7196a(jM7197a2, AbstractC3421a.f11061L)) {
                            return EnumC4617m0.SELECT_PAGE_UP;
                        }
                        if (AbstractC3421a.m7196a(jM7197a2, AbstractC3421a.f11053D) || AbstractC3421a.m7196a(jM7197a2, AbstractC3421a.f11062M)) {
                            return EnumC4617m0.SELECT_PAGE_DOWN;
                        }
                        if (AbstractC3421a.m7196a(jM7197a2, AbstractC3421a.f11086v) || AbstractC3421a.m7196a(jM7197a2, AbstractC3421a.f11059J)) {
                            return EnumC4617m0.SELECT_LINE_START;
                        }
                        if (AbstractC3421a.m7196a(jM7197a2, AbstractC3421a.f11087w) || AbstractC3421a.m7196a(jM7197a2, AbstractC3421a.f11060K)) {
                            return EnumC4617m0.SELECT_LINE_END;
                        }
                        if (!AbstractC3421a.m7196a(jM7197a2, AbstractC3421a.f11088x)) {
                            break;
                        }
                        return enumC4617m05;
                    }
                    if (iM9079v == 0) {
                        long jM7197a3 = AbstractC3424d.m7197a(keyEvent.getKeyCode());
                        if (AbstractC3421a.m7196a(jM7197a3, AbstractC3421a.f11070f) || AbstractC3421a.m7196a(jM7197a3, AbstractC3421a.f11057H)) {
                            return EnumC4617m0.LEFT_CHAR;
                        }
                        if (AbstractC3421a.m7196a(jM7197a3, AbstractC3421a.f11071g) || AbstractC3421a.m7196a(jM7197a3, AbstractC3421a.f11058I)) {
                            return EnumC4617m0.RIGHT_CHAR;
                        }
                        if (AbstractC3421a.m7196a(jM7197a3, AbstractC3421a.f11068d) || AbstractC3421a.m7196a(jM7197a3, AbstractC3421a.f11055F)) {
                            return EnumC4617m0.UP;
                        }
                        if (AbstractC3421a.m7196a(jM7197a3, AbstractC3421a.f11069e) || AbstractC3421a.m7196a(jM7197a3, AbstractC3421a.f11056G)) {
                            return EnumC4617m0.DOWN;
                        }
                        if (AbstractC3421a.m7196a(jM7197a3, AbstractC3421a.f11072h)) {
                            return EnumC4617m0.CENTER;
                        }
                        if (AbstractC3421a.m7196a(jM7197a3, AbstractC3421a.f11052C) || AbstractC3421a.m7196a(jM7197a3, AbstractC3421a.f11061L)) {
                            return EnumC4617m0.PAGE_UP;
                        }
                        if (AbstractC3421a.m7196a(jM7197a3, AbstractC3421a.f11053D) || AbstractC3421a.m7196a(jM7197a3, AbstractC3421a.f11062M)) {
                            return EnumC4617m0.PAGE_DOWN;
                        }
                        if (AbstractC3421a.m7196a(jM7197a3, AbstractC3421a.f11086v) || AbstractC3421a.m7196a(jM7197a3, AbstractC3421a.f11059J)) {
                            return EnumC4617m0.LINE_START;
                        }
                        if (AbstractC3421a.m7196a(jM7197a3, AbstractC3421a.f11087w) || AbstractC3421a.m7196a(jM7197a3, AbstractC3421a.f11060K)) {
                            return EnumC4617m0.LINE_END;
                        }
                        if (AbstractC3421a.m7196a(jM7197a3, AbstractC3421a.f11082r) || AbstractC3421a.m7196a(jM7197a3, AbstractC3421a.f11054E)) {
                            return EnumC4617m0.NEW_LINE;
                        }
                        if (AbstractC3421a.m7196a(jM7197a3, AbstractC3421a.f11083s)) {
                            return EnumC4617m0.DELETE_PREV_CHAR;
                        }
                        if (AbstractC3421a.m7196a(jM7197a3, AbstractC3421a.f11084t)) {
                            return EnumC4617m0.DELETE_NEXT_CHAR;
                        }
                        if (!AbstractC3421a.m7196a(jM7197a3, AbstractC3421a.f11050A)) {
                            if (!AbstractC3421a.m7196a(jM7197a3, AbstractC3421a.f11089y)) {
                                if (!AbstractC3421a.m7196a(jM7197a3, AbstractC3421a.f11090z)) {
                                    if (AbstractC3421a.m7196a(jM7197a3, AbstractC3421a.f11080p)) {
                                        return EnumC4617m0.TAB;
                                    }
                                }
                                return enumC4617m03;
                            }
                            return enumC4617m04;
                        }
                        return enumC4617m05;
                    }
                } else if (AbstractC3421a.m7196a(AbstractC3424d.m7197a(keyEvent.getKeyCode()), AbstractC3421a.f11079o)) {
                    return enumC4617m02;
                }
                return null;
            default:
                int iM9079v2 = AbstractC4634s.m9079v(keyEvent);
                int i9 = AbstractC4634s.f15373g;
                EnumC4617m0 enumC4617m06 = null;
                if (iM9079v2 == 9) {
                    long jM7197a4 = AbstractC3424d.m7197a(keyEvent.getKeyCode());
                    if (AbstractC3421a.m7196a(jM7197a4, AbstractC3421a.f11070f)) {
                        enumC4617m06 = EnumC4617m0.SELECT_LINE_LEFT;
                    } else if (AbstractC3421a.m7196a(jM7197a4, AbstractC3421a.f11071g)) {
                        enumC4617m06 = EnumC4617m0.SELECT_LINE_RIGHT;
                    } else if (AbstractC3421a.m7196a(jM7197a4, AbstractC3421a.f11068d)) {
                        enumC4617m06 = EnumC4617m0.SELECT_HOME;
                    } else if (AbstractC3421a.m7196a(jM7197a4, AbstractC3421a.f11069e)) {
                        enumC4617m06 = EnumC4617m0.SELECT_END;
                    }
                } else if (iM9079v2 == 1) {
                    long jM7197a5 = AbstractC3424d.m7197a(keyEvent.getKeyCode());
                    if (AbstractC3421a.m7196a(jM7197a5, AbstractC3421a.f11070f)) {
                        enumC4617m06 = EnumC4617m0.LINE_LEFT;
                    } else if (AbstractC3421a.m7196a(jM7197a5, AbstractC3421a.f11071g)) {
                        enumC4617m06 = EnumC4617m0.LINE_RIGHT;
                    } else if (AbstractC3421a.m7196a(jM7197a5, AbstractC3421a.f11068d)) {
                        enumC4617m06 = EnumC4617m0.HOME;
                    } else if (AbstractC3421a.m7196a(jM7197a5, AbstractC3421a.f11069e)) {
                        enumC4617m06 = EnumC4617m0.END;
                    } else if (AbstractC3421a.m7196a(jM7197a5, AbstractC3421a.f11083s)) {
                        enumC4617m06 = EnumC4617m0.DELETE_FROM_LINE_START;
                    }
                }
                if (enumC4617m06 != null) {
                    return enumC4617m06;
                }
                C2571a c2571a = AbstractC4634s.f15369c;
                c2571a.getClass();
                int i10 = AbstractC4634s.f15374h;
                int iM9079v3 = AbstractC4634s.m9079v(keyEvent);
                long jM7197a6 = AbstractC3424d.m7197a(keyEvent.getKeyCode());
                boolean zM7196a = AbstractC3421a.m7196a(jM7197a6, AbstractC3421a.f11083s);
                EnumC4617m0 enumC4617m07 = EnumC4617m0.DELETE_PREV_CHAR;
                if (zM7196a) {
                    if (iM9079v3 != 0 && iM9079v3 != 8) {
                        int i11 = AbstractC4634s.f15375i;
                        enumC4617m0 = iM9079v3 == 12 ? enumC4617m07 : (iM9079v3 == 2 || iM9079v3 == 10) ? EnumC4617m0.DELETE_PREV_WORD : null;
                    }
                } else if ((AbstractC3421a.m7196a(jM7197a6, AbstractC3421a.f11082r) || AbstractC3421a.m7196a(jM7197a6, AbstractC3421a.f11054E)) && (iM9079v3 == 0 || iM9079v3 == 8 || iM9079v3 == 2 || iM9079v3 == 10)) {
                    enumC4617m0 = EnumC4617m0.NEW_LINE;
                }
                if (enumC4617m0 != null) {
                    return enumC4617m0;
                }
                int iM9079v4 = AbstractC4634s.m9079v(keyEvent);
                if (iM9079v4 == 10) {
                    long jM7197a7 = AbstractC3424d.m7197a(keyEvent.getKeyCode());
                    enumC4617m07 = (AbstractC3421a.m7196a(jM7197a7, AbstractC3421a.f11070f) || AbstractC3421a.m7196a(jM7197a7, AbstractC3421a.f11057H)) ? EnumC4617m0.SELECT_LEFT_WORD : (AbstractC3421a.m7196a(jM7197a7, AbstractC3421a.f11071g) || AbstractC3421a.m7196a(jM7197a7, AbstractC3421a.f11058I)) ? EnumC4617m0.SELECT_RIGHT_WORD : (AbstractC3421a.m7196a(jM7197a7, AbstractC3421a.f11068d) || AbstractC3421a.m7196a(jM7197a7, AbstractC3421a.f11055F)) ? EnumC4617m0.SELECT_PREV_PARAGRAPH : (AbstractC3421a.m7196a(jM7197a7, AbstractC3421a.f11069e) || AbstractC3421a.m7196a(jM7197a7, AbstractC3421a.f11056G)) ? EnumC4617m0.SELECT_NEXT_PARAGRAPH : null;
                } else if (iM9079v4 == 2) {
                    long jM7197a8 = AbstractC3424d.m7197a(keyEvent.getKeyCode());
                    if (AbstractC3421a.m7196a(jM7197a8, AbstractC3421a.f11070f) || AbstractC3421a.m7196a(jM7197a8, AbstractC3421a.f11057H)) {
                        enumC4617m07 = EnumC4617m0.LEFT_WORD;
                    } else if (AbstractC3421a.m7196a(jM7197a8, AbstractC3421a.f11071g) || AbstractC3421a.m7196a(jM7197a8, AbstractC3421a.f11058I)) {
                        enumC4617m07 = EnumC4617m0.RIGHT_WORD;
                    } else if (AbstractC3421a.m7196a(jM7197a8, AbstractC3421a.f11068d) || AbstractC3421a.m7196a(jM7197a8, AbstractC3421a.f11055F)) {
                        enumC4617m07 = EnumC4617m0.PREV_PARAGRAPH;
                    } else if (AbstractC3421a.m7196a(jM7197a8, AbstractC3421a.f11069e) || AbstractC3421a.m7196a(jM7197a8, AbstractC3421a.f11056G)) {
                        enumC4617m07 = EnumC4617m0.NEXT_PARAGRAPH;
                    } else if (!AbstractC3421a.m7196a(jM7197a8, AbstractC3421a.f11075k)) {
                        if (AbstractC3421a.m7196a(jM7197a8, AbstractC3421a.f11084t)) {
                            enumC4617m07 = EnumC4617m0.DELETE_NEXT_WORD;
                        } else if (AbstractC3421a.m7196a(jM7197a8, AbstractC3421a.f11051B)) {
                            enumC4617m07 = EnumC4617m0.DESELECT;
                        }
                    }
                } else if (iM9079v4 == 8) {
                    long jM7197a9 = AbstractC3424d.m7197a(keyEvent.getKeyCode());
                    if (AbstractC3421a.m7196a(jM7197a9, AbstractC3421a.f11086v) || AbstractC3421a.m7196a(jM7197a9, AbstractC3421a.f11059J)) {
                        enumC4617m07 = EnumC4617m0.SELECT_LINE_START;
                    } else if (AbstractC3421a.m7196a(jM7197a9, AbstractC3421a.f11087w) || AbstractC3421a.m7196a(jM7197a9, AbstractC3421a.f11060K)) {
                        enumC4617m07 = EnumC4617m0.SELECT_LINE_END;
                    }
                } else if (iM9079v4 == 1 && AbstractC3421a.m7196a(AbstractC3424d.m7197a(keyEvent.getKeyCode()), AbstractC3421a.f11084t)) {
                    enumC4617m07 = EnumC4617m0.DELETE_TO_LINE_END;
                }
                return enumC4617m07 == null ? ((C4620n0) c2571a.f8339h).m9043a(keyEvent) : enumC4617m07;
        }
    }
}
