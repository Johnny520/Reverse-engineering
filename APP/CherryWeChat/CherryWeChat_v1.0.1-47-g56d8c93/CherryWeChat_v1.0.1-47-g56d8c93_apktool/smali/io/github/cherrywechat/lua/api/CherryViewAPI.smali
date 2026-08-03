.class public final Lio/github/cherrywechat/lua/api/CherryViewAPI;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ClickableViewAccessibility",
        "StaticFieldLeak"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;
    }
.end annotation


# static fields
.field public static final INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

.field private static final TAG:Ljava/lang/String;

.field private static final floatingWindows:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;",
            ">;"
        }
    .end annotation
.end field

.field private static final imageLoadExecutor:Ljava/util/concurrent/ExecutorService;

.field private static final viewIdCounter:Ljava/util/concurrent/atomic/AtomicLong;

.field private static final viewRefs:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private static final windowIdCounter:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-wide v0, -0x1151efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->TAG:Ljava/lang/String;

    new-instance v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->floatingWindows:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->windowIdCounter:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->viewIdCounter:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->viewRefs:Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->imageLoadExecutor:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic A(Ljava/lang/String;Ljava/util/Map;Lparty/iroiro/luajava/Lua;)LTC;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$56$lambda$55(Ljava/lang/String;Ljava/util/Map;Lparty/iroiro/luajava/Lua;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic A0(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$32(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic B(Ljava/lang/String;Ljava/util/Map;)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$73$lambda$72(Ljava/lang/String;Ljava/util/Map;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B0(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$108(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic C(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$130(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic C0(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$11$lambda$10$lambda$7$lambda$6(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Ljava/lang/String;Ljava/lang/String;)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$79$lambda$78(Ljava/lang/String;Ljava/lang/String;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D0(Ljava/lang/String;Landroid/widget/ImageView;)V
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->loadImageFromUrl$lambda$132(Ljava/lang/String;Landroid/widget/ImageView;)V

    return-void
.end method

.method public static synthetic E(Ljava/lang/String;II)LTC;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$110$lambda$109(Ljava/lang/String;II)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E0(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$28(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic F(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$25$lambda$24$lambda$23$lambda$22(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F0(ILjava/lang/String;)LTC;
    .locals 0

    invoke-static {p1, p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$1$lambda$0(Ljava/lang/String;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p1, p0, p2, p3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$11$lambda$10$lambda$7(Lparty/iroiro/luajava/Lua;ILandroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic G0(Landroid/content/Context;LHv;Landroid/view/WindowManager$LayoutParams;LHv;LGv;LGv;Landroid/widget/FrameLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static/range {p0 .. p8}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$99$lambda$98$lambda$97(Landroid/content/Context;LHv;Landroid/view/WindowManager$LayoutParams;LHv;LGv;LGv;Landroid/widget/FrameLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic H(Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p1, p2, p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$49$lambda$48$lambda$47$lambda$46$lambda$45$lambda$44(Lparty/iroiro/luajava/Lua;ILjava/lang/String;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H0(Ljava/lang/String;Ljava/util/Map;)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$65$lambda$64(Ljava/lang/String;Ljava/util/Map;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I(Ljava/lang/String;)LTC;
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$108$lambda$107(Ljava/lang/String;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I0(Lparty/iroiro/luajava/Lua;ILandroid/widget/EditText;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$18$lambda$17$lambda$14(Lparty/iroiro/luajava/Lua;ILandroid/widget/EditText;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic J(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$32$lambda$31(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J0(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$25(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic K(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$84(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic K0(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$101(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic L(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p1, p0, p2, p3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$25$lambda$24$lambda$23(Lparty/iroiro/luajava/Lua;ILandroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic L0(Lparty/iroiro/luajava/Lua;IILjava/util/List;)LTC;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$25$lambda$24$lambda$21$lambda$20(Lparty/iroiro/luajava/Lua;IILjava/util/List;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic M(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$33(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic M0(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$29(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic N(Ljava/lang/String;Ljava/lang/String;ILparty/iroiro/luajava/Lua;)LTC;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$5$lambda$4(Ljava/lang/String;Ljava/lang/String;ILparty/iroiro/luajava/Lua;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic N0(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$92(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic O(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$79(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic O0(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$18(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic P(Ljava/lang/String;Ljava/util/Map;)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$61$lambda$60(Ljava/lang/String;Ljava/util/Map;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic P0(Lparty/iroiro/luajava/Lua;ILjava/util/List;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$25$lambda$24$lambda$21(Lparty/iroiro/luajava/Lua;ILjava/util/List;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic Q(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$65(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic Q0(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p1, p0, p2, p3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$18$lambda$17$lambda$16(Lparty/iroiro/luajava/Lua;ILandroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic R(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$130$lambda$129$lambda$124$lambda$123$lambda$122$lambda$121(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic R0()LTC;
    .locals 1

    invoke-static {}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$117$lambda$116()LTC;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic S(Ljava/lang/String;Ljava/util/ArrayList;Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$25$lambda$24(Ljava/lang/String;Ljava/util/List;Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic T(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$103(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic U(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$61(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic V(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$18$lambda$17$lambda$16$lambda$15(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic W(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$49(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic X(Ljava/lang/String;)LTC;
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$92$lambda$91(Ljava/lang/String;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Y(Ljava/lang/String;Ljava/lang/String;ILparty/iroiro/luajava/Lua;)LTC;
    .locals 0

    invoke-static {p0, p1, p3, p2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$11$lambda$10(Ljava/lang/String;Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Z(Ljava/lang/String;Ljava/util/Map;Lparty/iroiro/luajava/Lua;)LTC;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$49$lambda$48(Ljava/lang/String;Ljava/util/Map;Lparty/iroiro/luajava/Lua;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)LTC;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$77$lambda$76(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a0(Ljava/lang/String;Ljava/lang/String;)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$81$lambda$80(Ljava/lang/String;Ljava/lang/String;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/util/Map;Lparty/iroiro/luajava/Lua;)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$130$lambda$129(Ljava/util/Map;Lparty/iroiro/luajava/Lua;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b0(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$117(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic c(Ljava/lang/Integer;Lparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$130$lambda$129$lambda$124$lambda$123(Ljava/lang/Integer;Lparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic c0(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$99(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private static final cleanup$lambda$135()LTC;
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->floatingWindows:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-wide v1, -0x1150cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_0
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;

    invoke-virtual {v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->isShowing()Z

    move-result v2

    if-eqz v2, :cond_0

    :try_start_0
    invoke-virtual {v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v2

    invoke-virtual {v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->getContainer()Landroid/widget/FrameLayout;

    move-result-object v1

    invoke-interface {v2, v1}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_1
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->floatingWindows:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->viewRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    sget-object v0, LTC;->a:LTC;

    return-object v0
.end method

.method public static synthetic d(Lparty/iroiro/luajava/Lua;ILjava/lang/String;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52(Lparty/iroiro/luajava/Lua;ILjava/lang/String;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic d0(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$82(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private final dp(F)F
    .locals 2

    .line 4
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return p1

    .line 5
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    .line 6
    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    return p1
.end method

.method private final dp(I)I
    .locals 2

    .line 1
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return p1

    :cond_0
    int-to-float p1, p1

    .line 2
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    .line 3
    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    float-to-int p1, p1

    return p1
.end method

.method public static synthetic e(Ljava/lang/String;)LTC;
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$105$lambda$104(Ljava/lang/String;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e0(Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p1, p2, p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37$lambda$36(Lparty/iroiro/luajava/Lua;ILjava/lang/String;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$110(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic f0(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$5(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic g(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$41(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic g0(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$81(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private final generateViewId()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x1eb57fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->viewIdCounter:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$5$lambda$4$lambda$3$lambda$2(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h0(Ljava/lang/String;Ljava/lang/String;)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$101$lambda$100(Ljava/lang/String;Ljava/lang/String;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$105(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic i0(Ljava/lang/String;)LTC;
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$103$lambda$102(Ljava/lang/String;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$26(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic j0(Ljava/lang/String;Ljava/util/Map;)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$69$lambda$68(Ljava/lang/String;Ljava/util/Map;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lparty/iroiro/luajava/Lua;ILjava/lang/String;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37(Lparty/iroiro/luajava/Lua;ILjava/lang/String;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic k0(Lparty/iroiro/luajava/Lua;ILjava/lang/String;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$49$lambda$48$lambda$47$lambda$46$lambda$45(Lparty/iroiro/luajava/Lua;ILjava/lang/String;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic l(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$89(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic l0(Ljava/lang/String;Ljava/util/Map;Lparty/iroiro/luajava/Lua;)LTC;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$41$lambda$40(Ljava/lang/String;Ljava/util/Map;Lparty/iroiro/luajava/Lua;)LTC;

    move-result-object p0

    return-object p0
.end method

.method private final loadImageFromUrl(Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->imageLoadExecutor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ln3;

    const/4 v2, 0x5

    invoke-direct {v1, v2, p2, p1}, Ln3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final loadImageFromUrl$lambda$132(Ljava/lang/String;Landroid/widget/ImageView;)V
    .locals 4

    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p0

    const-wide v0, -0x11692fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p0, Ljava/net/HttpURLConnection;

    const/16 v0, 0x2710

    invoke-virtual {p0, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    const/16 v0, 0x3a98

    invoke-virtual {p0, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/net/URLConnection;->setDoInput(Z)V

    invoke-virtual {p0}, Ljava/net/URLConnection;->connect()V

    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    if-eqz v1, :cond_0

    sget-object v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->INSTANCE:Lio/github/cherrywechat/lua/LuaUiScheduler;

    new-instance v2, Lf;

    const/4 v3, 0x4

    invoke-direct {v2, v3, p1, v1}, Lf;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Lio/github/cherrywechat/lua/LuaUiScheduler;->runOnUiThread(LUi;)V

    :cond_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-wide p0, -0x11552fffff835L

    invoke-static {p0, p1}, LGu;->r(J)Ljava/lang/String;

    const-wide p0, -0x11560fffff835L

    invoke-static {p0, p1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method private static final loadImageFromUrl$lambda$132$lambda$131(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)LTC;
    .locals 0

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method public static synthetic m(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$73(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic m0(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->loadImageFromUrl$lambda$132$lambda$131(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Ljava/lang/String;Ljava/util/Map;)LTC;
    .locals 0

    invoke-static {p1, p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$99$lambda$98(Ljava/util/Map;Ljava/lang/String;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n0(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$27(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$18$lambda$17(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o0(Ljava/lang/String;Z)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$84$lambda$83(Ljava/lang/String;Z)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p()LTC;
    .locals 1

    invoke-static {}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->cleanup$lambda$135()LTC;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic p0(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$56(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private final parseColor(Ljava/lang/String;I)I
    .locals 0

    if-nez p1, :cond_0

    return p2

    :cond_0
    :try_start_0
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    return p2
.end method

.method private final parseGravity(Ljava/lang/String;)I
    .locals 2

    if-eqz p1, :cond_0

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-wide v0, -0x1ec27fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_c

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-wide v0, -0x1ece4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_1

    :cond_1
    const/4 p1, 0x1

    return p1

    :sswitch_1
    const-wide v0, -0x1eb4dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto/16 :goto_1

    :sswitch_2
    const-wide v0, -0x1ec38fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto/16 :goto_1

    :sswitch_3
    const-wide v0, -0x1ecd8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_1

    :sswitch_4
    const-wide v0, -0x1ecdefffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_1

    :sswitch_5
    const-wide v0, -0x1ec93fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_1

    :cond_2
    const p1, 0x800003

    return p1

    :sswitch_6
    const-wide v0, -0x1ec8ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_1

    :cond_3
    const/16 p1, 0x30

    return p1

    :sswitch_7
    const-wide v0, -0x1ecb1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_1

    :cond_4
    const p1, 0x800005

    return p1

    :sswitch_8
    const-wide v0, -0x1ec98fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_1

    :cond_5
    const/16 p1, 0x10

    return p1

    :sswitch_9
    const-wide v0, -0x1ecf6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto/16 :goto_1

    :sswitch_a
    const-wide v0, -0x1eca8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto/16 :goto_1

    :cond_6
    const p1, 0x800033

    return p1

    :sswitch_b
    const-wide v0, -0x1ecc2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_1

    :cond_7
    const p1, 0x800035

    return p1

    :sswitch_c
    const-wide v0, -0x1ecd1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_1

    :cond_8
    const/16 p1, 0x11

    return p1

    :sswitch_d
    const-wide v0, -0x1eccafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_1

    :cond_9
    const/16 p1, 0x50

    return p1

    :sswitch_e
    const-wide v0, -0x1eb42fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_1

    :sswitch_f
    const-wide v0, -0x1ec82fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_1

    :cond_a
    const p1, 0x800053

    return p1

    :sswitch_10
    const-wide v0, -0x1ecb5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_1

    :cond_b
    const p1, 0x800055

    return p1

    :cond_c
    :goto_1
    const/4 p1, 0x0

    return p1

    :sswitch_data_0
    .sparse-switch
        -0x654dccf8 -> :sswitch_10
        -0x653acab2 -> :sswitch_f
        -0x6444bb39 -> :sswitch_e
        -0x527265d5 -> :sswitch_d
        -0x514d33ab -> :sswitch_c
        -0x43ec390f -> :sswitch_b
        -0x3997db4f -> :sswitch_a
        -0x244f9e65 -> :sswitch_9
        -0x14c923e0 -> :sswitch_8
        0x188db -> :sswitch_7
        0x1c155 -> :sswitch_6
        0x32a007 -> :sswitch_5
        0x677c21c -> :sswitch_4
        0x68ac462 -> :sswitch_3
        0x6f2d2b2 -> :sswitch_2
        0x705d4f8 -> :sswitch_1
        0x3f657e4e -> :sswitch_0
    .end sparse-switch
.end method

.method public static synthetic q(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$1(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic q0(Ljava/lang/Integer;Lparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$130$lambda$129$lambda$128$lambda$127(Ljava/lang/Integer;Lparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic r(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$112(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic r0(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$87(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private final readConfig(Lparty/iroiro/luajava/Lua;I)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lparty/iroiro/luajava/Lua;",
            "I)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1, p2}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_0
    const/4 p2, -0x2

    invoke-interface {p1, p2}, Lparty/iroiro/luajava/Lua;->next(I)I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_5

    invoke-interface {p1, p2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p2

    const/4 v1, -0x1

    invoke-interface {p1, v1}, Lparty/iroiro/luajava/Lua;->isString(I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_0
    invoke-interface {p1, v1}, Lparty/iroiro/luajava/Lua;->isNumber(I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1, v1}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1}, Lparty/iroiro/luajava/Lua;->isBoolean(I)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1, v1}, Lparty/iroiro/luajava/Lua;->toBoolean(I)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_1

    :cond_2
    invoke-interface {p1, v1}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p1, v1}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    if-eqz p2, :cond_4

    invoke-interface {v0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    invoke-interface {p1, v2}, Lparty/iroiro/luajava/Lua;->pop(I)V

    goto :goto_0

    :cond_5
    invoke-interface {p1, v2}, Lparty/iroiro/luajava/Lua;->pop(I)V

    return-object v0
.end method

.method private static final register$lambda$1(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1ebc2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-wide v1, -0x1ebc4fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v2

    const/4 v3, 0x0

    if-le v2, v0, :cond_1

    const/4 v2, 0x2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v4

    double-to-int p0, v4

    if-lez p0, :cond_1

    goto :goto_0

    :cond_1
    move v0, v3

    :goto_0
    sget-object p0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    new-instance v2, Lo8;

    const/4 v4, 0x3

    invoke-direct {v2, v1, v0, v4}, Lo8;-><init>(Ljava/lang/String;II)V

    invoke-direct {p0, v2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    return v3
.end method

.method private static final register$lambda$1$lambda$0(Ljava/lang/String;I)LTC;
    .locals 2

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentContext()Landroid/content/Context;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_1

    invoke-static {v1, p0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    :cond_1
    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$101(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x117f6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    :goto_0
    return v1

    :cond_1
    sget-object v2, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    new-instance v3, LO8;

    const/4 v4, 0x1

    invoke-direct {v3, v4, v0, p0}, LO8;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-direct {v2, v3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    return v1
.end method

.method private static final register$lambda$101$lambda$100(Ljava/lang/String;Ljava/lang/String;)LTC;
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->floatingWindows:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;

    sget-object v0, LTC;->a:LTC;

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->viewRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-nez p1, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->getContainer()Landroid/widget/FrameLayout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v2, v1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_2

    check-cast v1, Landroid/view/ViewGroup;

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_3
    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->getContainer()Landroid/widget/FrameLayout;

    move-result-object p0

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method private static final register$lambda$103(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x1179efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    new-instance v2, LS8;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, LS8;-><init>(Ljava/lang/String;I)V

    invoke-direct {v1, v2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    return v0
.end method

.method private static final register$lambda$103$lambda$102(Ljava/lang/String;)LTC;
    .locals 5

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->floatingWindows:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;

    sget-object v0, LTC;->a:LTC;

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->isShowing()Z

    move-result v1

    if-nez v1, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->getContainer()Landroid/widget/FrameLayout;

    move-result-object v2

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->getParams()Landroid/view/WindowManager$LayoutParams;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->setShowing(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-wide v1, -0x117f8fffff835L

    const-wide v3, -0x11786fffff835L

    invoke-static {v1, v2, v3, v4, p0}, LEy;->i(JJLjava/lang/Exception;)V

    :cond_1
    :goto_0
    return-object v0
.end method

.method private static final register$lambda$105(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x11646fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    new-instance v2, LS8;

    const/4 v3, 0x3

    invoke-direct {v2, p0, v3}, LS8;-><init>(Ljava/lang/String;I)V

    invoke-direct {v1, v2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    return v0
.end method

.method private static final register$lambda$105$lambda$104(Ljava/lang/String;)LTC;
    .locals 5

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->floatingWindows:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;

    sget-object v0, LTC;->a:LTC;

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->getContainer()Landroid/widget/FrameLayout;

    move-result-object v2

    invoke-interface {v1, v2}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->setShowing(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-wide v1, -0x117a0fffff835L

    const-wide v3, -0x117aefffff835L

    invoke-static {v1, v2, v3, v4, p0}, LEy;->i(JJLjava/lang/Exception;)V

    :cond_1
    :goto_0
    return-object v0
.end method

.method private static final register$lambda$108(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x11671fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    new-instance v2, LS8;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, LS8;-><init>(Ljava/lang/String;I)V

    invoke-direct {v1, v2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    return v0
.end method

.method private static final register$lambda$108$lambda$107(Ljava/lang/String;)LTC;
    .locals 4

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->floatingWindows:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->getContainer()Landroid/widget/FrameLayout;

    move-result-object p0

    invoke-interface {v0, p0}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-wide v0, -0x11648fffff835L

    const-wide v2, -0x11656fffff835L

    invoke-static {v0, v1, v2, v3, p0}, LEy;->i(JJLjava/lang/Exception;)V

    :cond_0
    :goto_0
    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$11(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1ebd2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide v0, -0x1ebd4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_0
    const/4 v1, 0x2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const-wide v1, -0x1ebd5fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :cond_1
    const/4 v2, 0x3

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_2

    return v4

    :cond_2
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v2

    sget-object v3, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    new-instance v5, Ln8;

    invoke-direct {v5, v0, v1, v2, p0}, Ln8;-><init>(Ljava/lang/String;Ljava/lang/String;ILparty/iroiro/luajava/Lua;)V

    invoke-direct {v3, v5}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    return v4
.end method

.method private static final register$lambda$11$lambda$10(Ljava/lang/String;Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 2

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, p0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    const-wide v0, -0x1ebccfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ll8;

    const/4 v1, 0x4

    invoke-direct {v0, p2, p3, v1}, Ll8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {p0, p1, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    const-wide v0, -0x1ebcffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ll8;

    const/4 v1, 0x5

    invoke-direct {v0, p2, p3, v1}, Ll8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {p0, p1, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    :cond_0
    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$11$lambda$10$lambda$7(Lparty/iroiro/luajava/Lua;ILandroid/content/DialogInterface;I)V
    .locals 1

    invoke-interface {p2}, Landroid/content/DialogInterface;->dismiss()V

    sget-object p2, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance p3, LZ8;

    const/4 v0, 0x2

    invoke-direct {p3, p0, p1, v0}, LZ8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {p2, p0, p3}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    return-void
.end method

.method private static final register$lambda$11$lambda$10$lambda$7$lambda$6(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 2

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$11$lambda$10$lambda$9(Lparty/iroiro/luajava/Lua;ILandroid/content/DialogInterface;I)V
    .locals 1

    invoke-interface {p2}, Landroid/content/DialogInterface;->dismiss()V

    sget-object p2, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance p3, Lj8;

    const/16 v0, 0x1d

    invoke-direct {p3, p0, p1, v0}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {p2, p0, p3}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    return-void
.end method

.method private static final register$lambda$11$lambda$10$lambda$9$lambda$8(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 2

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 v1, 0x1

    invoke-interface {p0, v1, v0}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$110(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x11673fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v2

    double-to-int v2, v2

    const/4 v3, 0x3

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v3

    double-to-int p0, v3

    sget-object v3, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    new-instance v4, LU8;

    const/4 v5, 0x1

    invoke-direct {v4, v0, v2, p0, v5}, LU8;-><init>(Ljava/lang/String;III)V

    invoke-direct {v3, v4}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    return v1
.end method

.method private static final register$lambda$110$lambda$109(Ljava/lang/String;II)LTC;
    .locals 2

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->floatingWindows:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;

    sget-object v0, LTC;->a:LTC;

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->getParams()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    iput p1, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->getParams()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->y:I

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->getWindowManager()Landroid/view/WindowManager;

    move-result-object p1

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->getContainer()Landroid/widget/FrameLayout;

    move-result-object p2

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->getParams()Landroid/view/WindowManager$LayoutParams;

    move-result-object p0

    invoke-interface {p1, p2, p0}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_1
    return-object v0
.end method

.method private static final register$lambda$112(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x11675fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v2

    double-to-int v2, v2

    sget-object v3, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v3, v2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->dp(I)I

    move-result v2

    const/4 v4, 0x3

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v4

    double-to-int p0, v4

    invoke-direct {v3, p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->dp(I)I

    move-result p0

    new-instance v4, LU8;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v2, p0, v5}, LU8;-><init>(Ljava/lang/String;III)V

    invoke-direct {v3, v4}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    return v1
.end method

.method private static final register$lambda$112$lambda$111(Ljava/lang/String;II)LTC;
    .locals 2

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->floatingWindows:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;

    sget-object v0, LTC;->a:LTC;

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->getParams()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    iput p1, v1, Landroid/view/WindowManager$LayoutParams;->width:I

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->getParams()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->height:I

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->getWindowManager()Landroid/view/WindowManager;

    move-result-object p1

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->getContainer()Landroid/widget/FrameLayout;

    move-result-object p2

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->getParams()Landroid/view/WindowManager$LayoutParams;

    move-result-object p0

    invoke-interface {p1, p2, p0}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_1
    return-object v0
.end method

.method private static final register$lambda$114(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x11677fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->floatingWindows:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    const-wide v1, -0x11679fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v0}, Lra;->r0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    invoke-interface {p0, v1, v2}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v3, v2, 0x1

    if-ltz v2, :cond_0

    check-cast v1, Ljava/lang/String;

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    const/4 v1, -0x2

    invoke-interface {p0, v1, v3}, Lparty/iroiro/luajava/Lua;->rawSetI(II)V

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-static {}, Lsa;->c0()V

    const/4 p0, 0x0

    throw p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method private static final register$lambda$117(Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x116c4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object p0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    new-instance v0, Ld;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Ld;-><init>(I)V

    invoke-direct {p0, v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    const/4 p0, 0x0

    return p0
.end method

.method private static final register$lambda$117$lambda$116()LTC;
    .locals 6

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->floatingWindows:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-wide v1, -0x11609fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;

    invoke-virtual {v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->isShowing()Z

    move-result v2

    if-eqz v2, :cond_0

    :try_start_0
    invoke-virtual {v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v2

    invoke-virtual {v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->getContainer()Landroid/widget/FrameLayout;

    move-result-object v1

    invoke-interface {v2, v1}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-wide v2, -0x1161bfffff835L

    const-wide v4, -0x11629fffff835L

    invoke-static {v2, v3, v4, v5, v1}, LEy;->i(JJLjava/lang/Exception;)V

    goto :goto_0

    :cond_1
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->floatingWindows:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    sget-object v0, LTC;->a:LTC;

    return-object v0
.end method

.method private static final register$lambda$130(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x11690fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v1, p0, v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->readConfig(Lparty/iroiro/luajava/Lua;I)Ljava/util/Map;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, LLf;->a:LLf;

    :goto_0
    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    new-instance v2, Lf;

    const/4 v3, 0x3

    invoke-direct {v2, v3, v0, p0}, Lf;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v1, v2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    const/4 p0, 0x0

    return p0
.end method

.method private static final register$lambda$130$lambda$129(Ljava/util/Map;Lparty/iroiro/luajava/Lua;)LTC;
    .locals 7

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    sget-object v1, LTC;->a:LTC;

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_6

    :cond_0
    const-wide v2, -0x116c6fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/String;

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    check-cast v2, Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object v2, v4

    :goto_0
    const-wide v5, -0x116ccfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Ljava/lang/String;

    if-eqz v5, :cond_2

    check-cast v3, Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v3, v4

    :goto_1
    const-wide v5, -0x116d1fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-interface {p0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v5, v6}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    xor-int/lit8 v5, v5, 0x1

    new-instance v6, Landroid/app/AlertDialog$Builder;

    invoke-direct {v6, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    if-eqz v2, :cond_3

    invoke-virtual {v6, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    :cond_3
    if-eqz v3, :cond_6

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->viewRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_4

    check-cast v2, Landroid/view/ViewGroup;

    goto :goto_2

    :cond_4
    move-object v2, v4

    :goto_2
    if-eqz v2, :cond_5

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_5
    invoke-virtual {v6, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    :cond_6
    invoke-virtual {v6, v5}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    const-wide v2, -0x116dcfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/String;

    if-eqz v2, :cond_7

    check-cast v0, Ljava/lang/String;

    goto :goto_3

    :cond_7
    move-object v0, v4

    :goto_3
    if-eqz v0, :cond_9

    const-wide v2, -0x116ebfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/Integer;

    if-eqz v3, :cond_8

    check-cast v2, Ljava/lang/Integer;

    goto :goto_4

    :cond_8
    move-object v2, v4

    :goto_4
    new-instance v3, LV8;

    const/4 v5, 0x0

    invoke-direct {v3, v2, p1, v5}, LV8;-><init>(Ljava/lang/Integer;Lparty/iroiro/luajava/Lua;I)V

    invoke-virtual {v6, v0, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    :cond_9
    const-wide v2, -0x116f6fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/String;

    if-eqz v2, :cond_a

    check-cast v0, Ljava/lang/String;

    goto :goto_5

    :cond_a
    move-object v0, v4

    :goto_5
    if-eqz v0, :cond_c

    const-wide v2, -0x11685fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of v2, p0, Ljava/lang/Integer;

    if-eqz v2, :cond_b

    move-object v4, p0

    check-cast v4, Ljava/lang/Integer;

    :cond_b
    new-instance p0, LV8;

    const/4 v2, 0x1

    invoke-direct {p0, v4, p1, v2}, LV8;-><init>(Ljava/lang/Integer;Lparty/iroiro/luajava/Lua;I)V

    invoke-virtual {v6, v0, p0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    :cond_c
    invoke-virtual {v6}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    :cond_d
    :goto_6
    return-object v1
.end method

.method private static final register$lambda$130$lambda$129$lambda$124$lambda$123(Ljava/lang/Integer;Lparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V
    .locals 1

    invoke-interface {p2}, Landroid/content/DialogInterface;->dismiss()V

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    sget-object p2, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance p3, LZ8;

    const/4 v0, 0x0

    invoke-direct {p3, p1, p0, v0}, LZ8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {p2, p1, p3}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private static final register$lambda$130$lambda$129$lambda$124$lambda$123$lambda$122$lambda$121(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    const/4 p1, 0x0

    invoke-interface {p0, p1, p1}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$130$lambda$129$lambda$128$lambda$127(Ljava/lang/Integer;Lparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V
    .locals 1

    invoke-interface {p2}, Landroid/content/DialogInterface;->dismiss()V

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    sget-object p2, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance p3, Lj8;

    const/16 v0, 0x19

    invoke-direct {p3, p1, p0, v0}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {p2, p1, p3}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private static final register$lambda$130$lambda$129$lambda$128$lambda$127$lambda$126$lambda$125(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    const/4 p1, 0x0

    invoke-interface {p0, p1, p1}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$18(Lparty/iroiro/luajava/Lua;)I
    .locals 9

    const-wide v0, -0x1ebdcfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide v0, -0x1ebdefffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_0
    move-object v2, v0

    const/4 v0, 0x2

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-wide v0, -0x1ebdffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_1
    move-object v3, v0

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v0

    const/4 v1, 0x3

    const/4 v4, 0x4

    if-lt v0, v4, :cond_2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    const-wide v5, -0x1ebe0fffff835L

    :goto_0
    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    const-wide v5, -0x1ebe1fffff835L

    goto :goto_0

    :cond_3
    :goto_1
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v5

    if-lt v5, v4, :cond_4

    move v1, v4

    :cond_4
    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v4

    const/4 v7, 0x0

    if-nez v4, :cond_5

    return v7

    :cond_5
    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v6

    sget-object v8, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    new-instance v1, LQ8;

    move-object v5, p0

    move-object v4, v0

    invoke-direct/range {v1 .. v6}, LQ8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)V

    invoke-direct {v8, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    return v7
.end method

.method private static final register$lambda$18$lambda$17(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 2

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/widget/EditText;

    invoke-direct {v1, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance p2, Landroid/app/AlertDialog$Builder;

    invoke-direct {p2, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, p0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    invoke-virtual {p0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    const-wide p1, -0x1ebd6fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    new-instance p2, LT8;

    const/4 v0, 0x1

    invoke-direct {p2, p3, p4, v1, v0}, LT8;-><init>(Lparty/iroiro/luajava/Lua;ILjava/lang/Object;I)V

    invoke-virtual {p0, p1, p2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    const-wide p1, -0x1ebd9fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ll8;

    const/4 v0, 0x7

    invoke-direct {p2, p3, p4, v0}, Ll8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {p0, p1, p2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    :cond_0
    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$18$lambda$17$lambda$14(Lparty/iroiro/luajava/Lua;ILandroid/widget/EditText;Landroid/content/DialogInterface;I)V
    .locals 1

    invoke-interface {p3}, Landroid/content/DialogInterface;->dismiss()V

    sget-object p3, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance p4, LJ8;

    const/4 v0, 0x2

    invoke-direct {p4, p0, p1, p2, v0}, LJ8;-><init>(Lparty/iroiro/luajava/Lua;ILjava/lang/Object;I)V

    invoke-virtual {p3, p0, p4}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    return-void
.end method

.method private static final register$lambda$18$lambda$17$lambda$14$lambda$13(Lparty/iroiro/luajava/Lua;ILandroid/widget/EditText;)LTC;
    .locals 1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    const/4 p2, 0x1

    const/4 v0, 0x0

    invoke-interface {p0, p2, v0}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$18$lambda$17$lambda$16(Lparty/iroiro/luajava/Lua;ILandroid/content/DialogInterface;I)V
    .locals 1

    invoke-interface {p2}, Landroid/content/DialogInterface;->dismiss()V

    sget-object p2, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance p3, LZ8;

    const/4 v0, 0x3

    invoke-direct {p3, p0, p1, v0}, LZ8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {p2, p0, p3}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    return-void
.end method

.method private static final register$lambda$18$lambda$17$lambda$16$lambda$15(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 2

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$25(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1ebe5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-wide v1, -0x1ebe7fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :cond_0
    const/4 v2, 0x2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_4

    const/4 v3, 0x3

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_1

    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_0
    const/4 v2, -0x2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->next(I)I

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, -0x1

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->pop(I)V

    goto :goto_0

    :cond_3
    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->pop(I)V

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v0

    sget-object v2, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    new-instance v3, La9;

    invoke-direct {v3, v1, v5, p0, v0}, La9;-><init>(Ljava/lang/String;Ljava/util/ArrayList;Lparty/iroiro/luajava/Lua;I)V

    invoke-direct {v2, v3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    :cond_4
    :goto_1
    return v4
.end method

.method private static final register$lambda$25$lambda$24(Ljava/lang/String;Ljava/util/List;Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, p0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/CharSequence;

    new-instance v1, LT8;

    const/4 v2, 0x0

    invoke-direct {v1, p2, p3, p1, v2}, LT8;-><init>(Lparty/iroiro/luajava/Lua;ILjava/lang/Object;I)V

    invoke-virtual {p0, v0, v1}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    const-wide v0, -0x1ebe2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ll8;

    const/4 v1, 0x3

    invoke-direct {v0, p2, p3, v1}, Ll8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {p0, p1, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    :cond_0
    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$25$lambda$24$lambda$21(Lparty/iroiro/luajava/Lua;ILjava/util/List;Landroid/content/DialogInterface;I)V
    .locals 1

    invoke-interface {p3}, Landroid/content/DialogInterface;->dismiss()V

    sget-object p3, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v0, LX8;

    invoke-direct {v0, p0, p1, p4, p2}, LX8;-><init>(Lparty/iroiro/luajava/Lua;IILjava/util/List;)V

    invoke-virtual {p3, p0, v0}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    return-void
.end method

.method private static final register$lambda$25$lambda$24$lambda$21$lambda$20(Lparty/iroiro/luajava/Lua;IILjava/util/List;)LTC;
    .locals 2

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    add-int/lit8 v0, p2, 0x1

    int-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    const/4 p2, 0x2

    const/4 p3, 0x0

    invoke-interface {p0, p2, p3}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$25$lambda$24$lambda$23(Lparty/iroiro/luajava/Lua;ILandroid/content/DialogInterface;I)V
    .locals 1

    invoke-interface {p2}, Landroid/content/DialogInterface;->dismiss()V

    sget-object p2, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance p3, LZ8;

    const/4 v0, 0x1

    invoke-direct {p3, p0, p1, v0}, LZ8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {p2, p0, p3}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    return-void
.end method

.method private static final register$lambda$25$lambda$24$lambda$23$lambda$22(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 2

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$26(Lparty/iroiro/luajava/Lua;)I
    .locals 7

    const-wide v0, -0x1ebe8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    sget-object v3, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v3}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentContext()Landroid/content/Context;

    move-result-object v4

    :goto_0
    if-eqz v4, :cond_2

    :try_start_0
    new-instance v3, Landroid/content/Intent;

    const-wide v5, -0x1ebeafffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v3, v5, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/high16 v1, 0x10000000

    invoke-virtual {v3, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {v4, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    goto :goto_1

    :cond_2
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    :goto_1
    return v0
.end method

.method private static final register$lambda$27(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1eb85fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    sget-object v3, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v3}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentContext()Landroid/content/Context;

    move-result-object v4

    :goto_0
    if-eqz v4, :cond_2

    :try_start_0
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v1, 0x10000000

    invoke-virtual {v3, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {v4, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    goto :goto_1

    :cond_2
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    :goto_1
    return v0
.end method

.method private static final register$lambda$28(Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1eb87fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final register$lambda$29(Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1eb89fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentContext()Landroid/content/Context;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_1

    sget-object v0, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v1, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    goto :goto_1

    :cond_1
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_1
    const/4 p0, 0x1

    return p0
.end method

.method private static final register$lambda$32(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x1eb8bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v0

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    new-instance v3, Lj8;

    const/16 v4, 0x1a

    invoke-direct {v3, p0, v0, v4}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-direct {v1, v3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    return v2
.end method

.method private static final register$lambda$32$lambda$31(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v1, Lj8;

    const/16 v2, 0x1b

    invoke-direct {v1, p0, p1, v2}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {v0, p0, v1}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$32$lambda$31$lambda$30(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    const/4 v0, 0x0

    invoke-interface {p0, v0, v0}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$33(Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1eb8dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final register$lambda$41(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1ea5efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v1, p0, v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->readConfig(Lparty/iroiro/luajava/Lua;I)Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    :cond_0
    sget-object v1, LLf;->a:LLf;

    :goto_0
    sget-object v2, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->generateViewId()Ljava/lang/String;

    move-result-object v3

    new-instance v4, LP8;

    const/4 v5, 0x1

    invoke-direct {v4, v3, v1, p0, v5}, LP8;-><init>(Ljava/lang/String;Ljava/util/Map;Lparty/iroiro/luajava/Lua;I)V

    invoke-direct {v2, v4}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v0
.end method

.method private static final register$lambda$41$lambda$40(Ljava/lang/String;Ljava/util/Map;Lparty/iroiro/luajava/Lua;)LTC;
    .locals 8

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v1

    sget-object v2, LTC;->a:LTC;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentContext()Landroid/content/Context;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v2

    :cond_1
    :goto_0
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v3, -0x1eb8ffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/String;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    check-cast v1, Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v1, v4

    :goto_1
    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    const-wide v5, -0x1eb94fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-wide v5, -0x1eb95fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/Number;

    if-eqz v3, :cond_4

    check-cast v1, Ljava/lang/Number;

    goto :goto_3

    :cond_4
    move-object v1, v4

    :goto_3
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    goto :goto_4

    :cond_5
    const/high16 v1, 0x41600000    # 14.0f

    :goto_4
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    const-wide v5, -0x1eb9efffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Ljava/lang/String;

    if-eqz v5, :cond_6

    check-cast v3, Ljava/lang/String;

    goto :goto_5

    :cond_6
    move-object v3, v4

    :goto_5
    const/4 v5, -0x1

    invoke-direct {v1, v3, v5}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->parseColor(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const-wide v5, -0x1eba8fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Ljava/lang/String;

    if-eqz v5, :cond_7

    check-cast v3, Ljava/lang/String;

    goto :goto_6

    :cond_7
    move-object v3, v4

    :goto_6
    invoke-direct {v1, v3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->parseGravity(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setGravity(I)V

    const-wide v5, -0x1ebb0fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Ljava/lang/String;

    if-eqz v5, :cond_8

    check-cast v3, Ljava/lang/String;

    goto :goto_7

    :cond_8
    move-object v3, v4

    :goto_7
    const/4 v5, 0x0

    if-eqz v3, :cond_9

    invoke-direct {v1, v3, v5}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->parseColor(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_9
    const-wide v6, -0x1ea40fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v6, v3, Ljava/lang/Number;

    if-eqz v6, :cond_a

    check-cast v3, Ljava/lang/Number;

    goto :goto_8

    :cond_a
    move-object v3, v4

    :goto_8
    if-eqz v3, :cond_b

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-direct {v1, v3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->dp(I)I

    move-result v5

    :cond_b
    invoke-virtual {v0, v5, v5, v5, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    const-wide v5, -0x1ea48fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_c
    const-wide v5, -0x1ea4dfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/Number;

    if-eqz v3, :cond_d

    check-cast v1, Ljava/lang/Number;

    goto :goto_9

    :cond_d
    move-object v1, v4

    :goto_9
    if-eqz v1, :cond_e

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    :cond_e
    const-wide v5, -0x1ea56fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Ljava/lang/Integer;

    if-eqz v1, :cond_f

    move-object v4, p1

    check-cast v4, Ljava/lang/Integer;

    :cond_f
    if-eqz v4, :cond_10

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result p1

    new-instance v1, LL8;

    const/4 v3, 0x2

    invoke-direct {v1, p2, p1, p0, v3}, LL8;-><init>(Lparty/iroiro/luajava/Lua;ILjava/lang/String;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_10
    sget-object p1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->viewRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2
.end method

.method private static final register$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37(Lparty/iroiro/luajava/Lua;ILjava/lang/String;Landroid/view/View;)V
    .locals 2

    sget-object p3, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v0, LE8;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p1, p2, v1}, LE8;-><init>(Lparty/iroiro/luajava/Lua;ILjava/lang/String;I)V

    invoke-virtual {p3, p0, v0}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    return-void
.end method

.method private static final register$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37$lambda$36(Lparty/iroiro/luajava/Lua;ILjava/lang/String;)LTC;
    .locals 0

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-interface {p0, p1, p2}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$49(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1eac6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v1, p0, v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->readConfig(Lparty/iroiro/luajava/Lua;I)Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    :cond_0
    sget-object v1, LLf;->a:LLf;

    :goto_0
    sget-object v2, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->generateViewId()Ljava/lang/String;

    move-result-object v3

    new-instance v4, LP8;

    const/4 v5, 0x0

    invoke-direct {v4, v3, v1, p0, v5}, LP8;-><init>(Ljava/lang/String;Ljava/util/Map;Lparty/iroiro/luajava/Lua;I)V

    invoke-direct {v2, v4}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v0
.end method

.method private static final register$lambda$49$lambda$48(Ljava/lang/String;Ljava/util/Map;Lparty/iroiro/luajava/Lua;)LTC;
    .locals 7

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v1

    sget-object v2, LTC;->a:LTC;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentContext()Landroid/content/Context;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v2

    :cond_1
    :goto_0
    new-instance v0, Landroid/widget/ImageView;

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const-wide v3, -0x1ea60fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/String;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    check-cast v1, Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v1, v4

    :goto_1
    if-eqz v1, :cond_5

    const-wide v5, -0x1ea64fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    const-wide v5, -0x1ea6cfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_2

    :cond_3
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_3

    :cond_4
    :goto_2
    sget-object v3, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v3, v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->loadImageFromUrl(Landroid/widget/ImageView;Ljava/lang/String;)V

    :cond_5
    :goto_3
    const-wide v5, -0x1ea75fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/String;

    if-eqz v3, :cond_6

    check-cast v1, Ljava/lang/String;

    goto :goto_4

    :cond_6
    move-object v1, v4

    :goto_4
    if-eqz v1, :cond_c

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto :goto_5

    :sswitch_0
    const-wide v5, -0x1ea23fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_5

    :cond_7
    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    goto :goto_6

    :sswitch_1
    const-wide v5, -0x1ea13fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_5

    :cond_8
    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    goto :goto_6

    :sswitch_2
    const-wide v5, -0x1ea1dfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_5

    :cond_9
    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    goto :goto_6

    :sswitch_3
    const-wide v5, -0x1ea7ffffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_5

    :cond_a
    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    goto :goto_6

    :sswitch_4
    const-wide v5, -0x1ea0cfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    goto :goto_5

    :cond_b
    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    goto :goto_6

    :cond_c
    :goto_5
    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    :goto_6
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    const-wide v5, -0x1ea2efffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/String;

    if-eqz v3, :cond_d

    check-cast v1, Ljava/lang/String;

    goto :goto_7

    :cond_d
    move-object v1, v4

    :goto_7
    if-eqz v1, :cond_e

    sget-object v3, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    const/4 v5, 0x0

    invoke-direct {v3, v1, v5}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->parseColor(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_e
    const-wide v5, -0x1ea3efffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Ljava/lang/Integer;

    if-eqz v1, :cond_f

    move-object v4, p1

    check-cast v4, Ljava/lang/Integer;

    :cond_f
    if-eqz v4, :cond_10

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result p1

    new-instance v1, LL8;

    const/4 v3, 0x1

    invoke-direct {v1, p2, p1, p0, v3}, LL8;-><init>(Lparty/iroiro/luajava/Lua;ILjava/lang/String;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_10
    sget-object p1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->viewRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        -0x514d33ab -> :sswitch_4
        -0x144ecb4f -> :sswitch_3
        0x5ced6d2 -> :sswitch_2
        0x1f0a33c6 -> :sswitch_1
        0x453ac885 -> :sswitch_0
    .end sparse-switch
.end method

.method private static final register$lambda$49$lambda$48$lambda$47$lambda$46$lambda$45(Lparty/iroiro/luajava/Lua;ILjava/lang/String;Landroid/view/View;)V
    .locals 2

    sget-object p3, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v0, LE8;

    const/4 v1, 0x3

    invoke-direct {v0, p0, p1, p2, v1}, LE8;-><init>(Lparty/iroiro/luajava/Lua;ILjava/lang/String;I)V

    invoke-virtual {p3, p0, v0}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    return-void
.end method

.method private static final register$lambda$49$lambda$48$lambda$47$lambda$46$lambda$45$lambda$44(Lparty/iroiro/luajava/Lua;ILjava/lang/String;)LTC;
    .locals 0

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-interface {p0, p1, p2}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$5(Lparty/iroiro/luajava/Lua;)I
    .locals 7

    const-wide v0, -0x1ebc8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide v0, -0x1ebcafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_0
    move-object v2, v0

    const/4 v0, 0x2

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-wide v0, -0x1ebcbfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_1
    move-object v3, v0

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v0

    :goto_0
    move v4, v0

    goto :goto_1

    :cond_2
    const/4 v0, -0x1

    goto :goto_0

    :goto_1
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    new-instance v1, Ln8;

    const/4 v6, 0x3

    move-object v5, p0

    invoke-direct/range {v1 .. v6}, Ln8;-><init>(Ljava/lang/String;Ljava/lang/String;ILparty/iroiro/luajava/Lua;I)V

    invoke-direct {v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    const/4 p0, 0x0

    return p0
.end method

.method private static final register$lambda$5$lambda$4(Ljava/lang/String;Ljava/lang/String;ILparty/iroiro/luajava/Lua;)LTC;
    .locals 2

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, p0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    const-wide v0, -0x1ebc5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ll8;

    const/4 v1, 0x6

    invoke-direct {v0, p2, p3, v1}, Ll8;-><init>(ILparty/iroiro/luajava/Lua;I)V

    invoke-virtual {p0, p1, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    :cond_0
    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$5$lambda$4$lambda$3(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V
    .locals 1

    invoke-interface {p2}, Landroid/content/DialogInterface;->dismiss()V

    const/4 p2, -0x1

    if-eq p0, p2, :cond_0

    sget-object p2, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance p3, Lj8;

    const/16 v0, 0x1c

    invoke-direct {p3, p1, p0, v0}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {p2, p1, p3}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private static final register$lambda$5$lambda$4$lambda$3$lambda$2(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 2

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$56(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1ea9cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v1, p0, v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->readConfig(Lparty/iroiro/luajava/Lua;I)Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    :cond_0
    sget-object v1, LLf;->a:LLf;

    :goto_0
    sget-object v2, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->generateViewId()Ljava/lang/String;

    move-result-object v3

    new-instance v4, LP8;

    const/4 v5, 0x2

    invoke-direct {v4, v3, v1, p0, v5}, LP8;-><init>(Ljava/lang/String;Ljava/util/Map;Lparty/iroiro/luajava/Lua;I)V

    invoke-direct {v2, v4}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v0
.end method

.method private static final register$lambda$56$lambda$55(Ljava/lang/String;Ljava/util/Map;Lparty/iroiro/luajava/Lua;)LTC;
    .locals 7

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v1

    sget-object v2, LTC;->a:LTC;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentContext()Landroid/content/Context;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v2

    :cond_1
    :goto_0
    new-instance v0, Landroid/widget/Button;

    invoke-direct {v0, v1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    const-wide v3, -0x1eac8fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/String;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    check-cast v1, Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v1, v4

    :goto_1
    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    const-wide v5, -0x1eacdfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-wide v5, -0x1ead4fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/Number;

    if-eqz v3, :cond_4

    check-cast v1, Ljava/lang/Number;

    goto :goto_3

    :cond_4
    move-object v1, v4

    :goto_3
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    goto :goto_4

    :cond_5
    const/high16 v1, 0x41600000    # 14.0f

    :goto_4
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    const-wide v5, -0x1eaddfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Ljava/lang/String;

    if-eqz v5, :cond_6

    check-cast v3, Ljava/lang/String;

    goto :goto_5

    :cond_6
    move-object v3, v4

    :goto_5
    const/4 v5, -0x1

    invoke-direct {v1, v3, v5}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->parseColor(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const-wide v5, -0x1eae7fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Ljava/lang/String;

    if-eqz v5, :cond_7

    check-cast v3, Ljava/lang/String;

    goto :goto_6

    :cond_7
    move-object v3, v4

    :goto_6
    const-wide v5, -0x1eaf7fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    invoke-direct {v1, v3, v5}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->parseColor(Ljava/lang/String;I)I

    move-result v3

    const-wide v5, -0x1eafffffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Ljava/lang/Number;

    if-eqz v6, :cond_8

    check-cast v5, Ljava/lang/Number;

    goto :goto_7

    :cond_8
    move-object v5, v4

    :goto_7
    if-eqz v5, :cond_9

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    :goto_8
    invoke-direct {v1, v5}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->dp(F)F

    move-result v5

    goto :goto_9

    :cond_9
    const/high16 v5, 0x41000000    # 8.0f

    goto :goto_8

    :goto_9
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v6, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v6, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v0, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const-wide v5, -0x1ea8cfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Ljava/lang/Number;

    if-eqz v5, :cond_a

    check-cast v3, Ljava/lang/Number;

    goto :goto_a

    :cond_a
    move-object v3, v4

    :goto_a
    if-eqz v3, :cond_b

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    :goto_b
    invoke-direct {v1, v3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->dp(I)I

    move-result v1

    goto :goto_c

    :cond_b
    const/16 v3, 0xc

    goto :goto_b

    :goto_c
    div-int/lit8 v3, v1, 0x2

    invoke-virtual {v0, v1, v3, v1, v3}, Landroid/view/View;->setPadding(IIII)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setAllCaps(Z)V

    const-wide v5, -0x1ea94fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Ljava/lang/Integer;

    if-eqz v1, :cond_c

    move-object v4, p1

    check-cast v4, Ljava/lang/Integer;

    :cond_c
    if-eqz v4, :cond_d

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result p1

    new-instance v1, LL8;

    const/4 v3, 0x0

    invoke-direct {v1, p2, p1, p0, v3}, LL8;-><init>(Lparty/iroiro/luajava/Lua;ILjava/lang/String;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_d
    sget-object p1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->viewRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2
.end method

.method private static final register$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52(Lparty/iroiro/luajava/Lua;ILjava/lang/String;Landroid/view/View;)V
    .locals 2

    sget-object p3, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v0, LE8;

    const/4 v1, 0x4

    invoke-direct {v0, p0, p1, p2, v1}, LE8;-><init>(Lparty/iroiro/luajava/Lua;ILjava/lang/String;I)V

    invoke-virtual {p3, p0, v0}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    return-void
.end method

.method private static final register$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$lambda$51(Lparty/iroiro/luajava/Lua;ILjava/lang/String;)LTC;
    .locals 0

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-interface {p0, p1, p2}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$61(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1e973fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v1, p0, v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->readConfig(Lparty/iroiro/luajava/Lua;I)Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    :cond_0
    sget-object v1, LLf;->a:LLf;

    :goto_0
    sget-object v2, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->generateViewId()Ljava/lang/String;

    move-result-object v3

    new-instance v4, LN8;

    const/4 v5, 0x4

    invoke-direct {v4, v3, v1, v5}, LN8;-><init>(Ljava/lang/String;Ljava/util/Map;I)V

    invoke-direct {v2, v4}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v0
.end method

.method private static final register$lambda$61$lambda$60(Ljava/lang/String;Ljava/util/Map;)LTC;
    .locals 7

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v1

    sget-object v2, LTC;->a:LTC;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentContext()Landroid/content/Context;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v2

    :cond_1
    :goto_0
    new-instance v0, Landroid/widget/EditText;

    invoke-direct {v0, v1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    const-wide v3, -0x1ea9efffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/String;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    check-cast v1, Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v1, v4

    :goto_1
    if-nez v1, :cond_3

    const-wide v5, -0x1eaa3fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :cond_3
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-wide v5, -0x1eaa4fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/String;

    if-eqz v3, :cond_4

    check-cast v1, Ljava/lang/String;

    goto :goto_2

    :cond_4
    move-object v1, v4

    :goto_2
    if-eqz v1, :cond_5

    goto :goto_3

    :cond_5
    const-wide v5, -0x1eaa9fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :goto_3
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    const-wide v5, -0x1eaaafffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/Number;

    if-eqz v3, :cond_6

    check-cast v1, Ljava/lang/Number;

    goto :goto_4

    :cond_6
    move-object v1, v4

    :goto_4
    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    goto :goto_5

    :cond_7
    const/high16 v1, 0x41600000    # 14.0f

    :goto_5
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    const-wide v5, -0x1eab3fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Ljava/lang/String;

    if-eqz v5, :cond_8

    check-cast v3, Ljava/lang/String;

    goto :goto_6

    :cond_8
    move-object v3, v4

    :goto_6
    const/4 v5, -0x1

    invoke-direct {v1, v3, v5}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->parseColor(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const-wide v5, -0x1eabdfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Ljava/lang/String;

    if-eqz v5, :cond_9

    check-cast v3, Ljava/lang/String;

    goto :goto_7

    :cond_9
    move-object v3, v4

    :goto_7
    const v5, -0x777778

    invoke-direct {v1, v3, v5}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->parseColor(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setHintTextColor(I)V

    const-wide v5, -0x1e947fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Ljava/lang/String;

    if-eqz v5, :cond_a

    check-cast v3, Ljava/lang/String;

    goto :goto_8

    :cond_a
    move-object v3, v4

    :goto_8
    if-eqz v3, :cond_b

    const/4 v5, 0x0

    invoke-direct {v1, v3, v5}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->parseColor(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_b
    const-wide v5, -0x1e957fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Ljava/lang/Number;

    if-eqz v5, :cond_c

    check-cast v3, Ljava/lang/Number;

    goto :goto_9

    :cond_c
    move-object v3, v4

    :goto_9
    if-eqz v3, :cond_d

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    :goto_a
    invoke-direct {v1, v3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->dp(I)I

    move-result v1

    goto :goto_b

    :cond_d
    const/16 v3, 0x8

    goto :goto_a

    :goto_b
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    const-wide v5, -0x1e95ffffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/Number;

    if-eqz v3, :cond_e

    move-object v4, v1

    check-cast v4, Ljava/lang/Number;

    :cond_e
    if-eqz v4, :cond_f

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    :cond_f
    const-wide v3, -0x1e968fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setSingleLine(Z)V

    sget-object p1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->viewRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2
.end method

.method private static final register$lambda$65(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1e92cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v1, p0, v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->readConfig(Lparty/iroiro/luajava/Lua;I)Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    :cond_0
    sget-object v1, LLf;->a:LLf;

    :goto_0
    sget-object v2, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->generateViewId()Ljava/lang/String;

    move-result-object v3

    new-instance v4, LN8;

    const/4 v5, 0x3

    invoke-direct {v4, v3, v1, v5}, LN8;-><init>(Ljava/lang/String;Ljava/util/Map;I)V

    invoke-direct {v2, v4}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v0
.end method

.method private static final register$lambda$65$lambda$64(Ljava/lang/String;Ljava/util/Map;)LTC;
    .locals 8

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v1

    sget-object v2, LTC;->a:LTC;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentContext()Landroid/content/Context;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v2

    :cond_1
    :goto_0
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const-wide v3, -0x1e975fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-wide v3, -0x1e901fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    const-wide v3, -0x1e90cfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/String;

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    check-cast v3, Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v3, v5

    :goto_1
    invoke-direct {v1, v3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->parseGravity(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    const-wide v3, -0x1e914fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_3

    check-cast v3, Ljava/lang/String;

    goto :goto_2

    :cond_3
    move-object v3, v5

    :goto_2
    const/4 v4, 0x0

    if-eqz v3, :cond_4

    invoke-direct {v1, v3, v4}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->parseColor(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_4
    const-wide v6, -0x1e924fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v3, p1, Ljava/lang/Number;

    if-eqz v3, :cond_5

    move-object v5, p1

    check-cast v5, Ljava/lang/Number;

    :cond_5
    if-eqz v5, :cond_6

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {v1, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->dp(I)I

    move-result v4

    :cond_6
    invoke-virtual {v0, v4, v4, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    sget-object p1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->viewRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2
.end method

.method private static final register$lambda$69(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1e9c6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v1, p0, v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->readConfig(Lparty/iroiro/luajava/Lua;I)Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    :cond_0
    sget-object v1, LLf;->a:LLf;

    :goto_0
    sget-object v2, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->generateViewId()Ljava/lang/String;

    move-result-object v3

    new-instance v4, LN8;

    const/4 v5, 0x2

    invoke-direct {v4, v3, v1, v5}, LN8;-><init>(Ljava/lang/String;Ljava/util/Map;I)V

    invoke-direct {v2, v4}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v0
.end method

.method private static final register$lambda$69$lambda$68(Ljava/lang/String;Ljava/util/Map;)LTC;
    .locals 7

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v1

    sget-object v2, LTC;->a:LTC;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentContext()Landroid/content/Context;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v2

    :cond_1
    :goto_0
    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const-wide v3, -0x1e92efffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/String;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    check-cast v1, Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v1, v4

    :goto_1
    const/4 v3, 0x0

    if-eqz v1, :cond_3

    sget-object v5, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v5, v1, v3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->parseColor(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_3
    const-wide v5, -0x1e93efffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Ljava/lang/Number;

    if-eqz v1, :cond_4

    move-object v4, p1

    check-cast v4, Ljava/lang/Number;

    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result p1

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v1, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->dp(I)I

    move-result v3

    :cond_5
    invoke-virtual {v0, v3, v3, v3, v3}, Landroid/view/View;->setPadding(IIII)V

    sget-object p1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->viewRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2
.end method

.method private static final register$lambda$73(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1e9e5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v1, p0, v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->readConfig(Lparty/iroiro/luajava/Lua;I)Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    :cond_0
    sget-object v1, LLf;->a:LLf;

    :goto_0
    sget-object v2, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->generateViewId()Ljava/lang/String;

    move-result-object v3

    new-instance v4, LN8;

    const/4 v5, 0x0

    invoke-direct {v4, v3, v1, v5}, LN8;-><init>(Ljava/lang/String;Ljava/util/Map;I)V

    invoke-direct {v2, v4}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v0
.end method

.method private static final register$lambda$73$lambda$72(Ljava/lang/String;Ljava/util/Map;)LTC;
    .locals 5

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v1

    sget-object v2, LTC;->a:LTC;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentContext()Landroid/content/Context;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v2

    :cond_1
    :goto_0
    new-instance v0, Landroid/widget/ScrollView;

    invoke-direct {v0, v1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    const-wide v3, -0x1e9c8fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    const-wide v3, -0x1e9d5fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Ljava/lang/String;

    if-eqz v1, :cond_2

    check-cast p1, Ljava/lang/String;

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_3

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    const/4 v3, 0x0

    invoke-direct {v1, p1, v3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->parseColor(Ljava/lang/String;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_3
    sget-object p1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->viewRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2
.end method

.method private static final register$lambda$77(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1e8d6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    :goto_0
    return v1

    :cond_1
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v3

    const/4 v4, 0x3

    if-lt v3, v4, :cond_2

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v3, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v3, p0, v4}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->readConfig(Lparty/iroiro/luajava/Lua;I)Ljava/util/Map;

    move-result-object p0

    goto :goto_1

    :cond_2
    sget-object p0, LLf;->a:LLf;

    :goto_1
    sget-object v3, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    new-instance v4, LM8;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v2, p0, v5}, LM8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-direct {v3, v4}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    return v1
.end method

.method private static final register$lambda$77$lambda$76(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)LTC;
    .locals 8

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->viewRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of v1, p0, Landroid/view/ViewGroup;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast p0, Landroid/view/ViewGroup;

    goto :goto_0

    :cond_0
    move-object p0, v2

    :goto_0
    sget-object v1, LTC;->a:LTC;

    if-nez p0, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-nez p1, :cond_2

    return-object v1

    :cond_2
    const-wide v3, -0x1e9e7fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-wide v3, -0x1e9edfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, -0x1

    const/4 v5, -0x2

    if-nez v3, :cond_6

    const-wide v6, -0x1e9f3fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_2

    :cond_3
    const-wide v6, -0x1e980fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    const-wide v6, -0x1e985fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    instance-of v0, v0, Ljava/lang/Number;

    if-eqz v0, :cond_5

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    const-wide v6, -0x1e992fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const-wide v6, -0x1e998fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-direct {v0, v3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->dp(I)I

    move-result v0

    goto :goto_3

    :cond_5
    :goto_1
    move v0, v5

    goto :goto_3

    :cond_6
    :goto_2
    move v0, v4

    :goto_3
    const-wide v6, -0x1e84bfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const-wide v6, -0x1e852fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    const-wide v6, -0x1e858fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    goto :goto_5

    :cond_7
    const-wide v6, -0x1e865fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    const-wide v6, -0x1e86afffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    goto :goto_4

    :cond_8
    instance-of v3, v3, Ljava/lang/Number;

    if-eqz v3, :cond_9

    sget-object v3, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    const-wide v4, -0x1e877fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const-wide v5, -0x1e87efffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-direct {v3, v4}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->dp(I)I

    move-result v4

    goto :goto_5

    :cond_9
    :goto_4
    move v4, v5

    :cond_a
    :goto_5
    instance-of v3, p0, Landroid/widget/LinearLayout;

    const/4 v5, 0x0

    if-eqz v3, :cond_10

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, v0, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const-wide v6, -0x1e831fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v4, v0, Ljava/lang/Number;

    if-eqz v4, :cond_b

    check-cast v0, Ljava/lang/Number;

    goto :goto_6

    :cond_b
    move-object v0, v2

    :goto_6
    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    goto :goto_7

    :cond_c
    const/4 v0, 0x0

    :goto_7
    iput v0, v3, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    const-wide v6, -0x1e838fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v4, v0, Ljava/lang/Number;

    if-eqz v4, :cond_d

    check-cast v0, Ljava/lang/Number;

    goto :goto_8

    :cond_d
    move-object v0, v2

    :goto_8
    if-eqz v0, :cond_e

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    sget-object v4, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v4, v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->dp(I)I

    move-result v5

    :cond_e
    invoke-virtual {v3, v5, v5, v5, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    const-wide v4, -0x1e83ffffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    instance-of v4, p2, Ljava/lang/String;

    if-eqz v4, :cond_f

    check-cast p2, Ljava/lang/String;

    goto :goto_9

    :cond_f
    move-object p2, v2

    :goto_9
    invoke-direct {v0, p2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->parseGravity(Ljava/lang/String;)I

    move-result p2

    iput p2, v3, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    goto :goto_c

    :cond_10
    instance-of v3, p0, Landroid/widget/FrameLayout;

    if-eqz v3, :cond_14

    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v3, v0, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const-wide v6, -0x1e8c7fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v4, v0, Ljava/lang/Number;

    if-eqz v4, :cond_11

    check-cast v0, Ljava/lang/Number;

    goto :goto_a

    :cond_11
    move-object v0, v2

    :goto_a
    if-eqz v0, :cond_12

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    sget-object v4, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v4, v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->dp(I)I

    move-result v5

    :cond_12
    invoke-virtual {v3, v5, v5, v5, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    const-wide v4, -0x1e8cefffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    instance-of v4, p2, Ljava/lang/String;

    if-eqz v4, :cond_13

    check-cast p2, Ljava/lang/String;

    goto :goto_b

    :cond_13
    move-object p2, v2

    :goto_b
    invoke-direct {v0, p2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->parseGravity(Ljava/lang/String;)I

    move-result p2

    iput p2, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    goto :goto_c

    :cond_14
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v3, v0, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    :goto_c
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    instance-of v0, p2, Landroid/view/ViewGroup;

    if-eqz v0, :cond_15

    move-object v2, p2

    check-cast v2, Landroid/view/ViewGroup;

    :cond_15
    if-eqz v2, :cond_16

    invoke-virtual {v2, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_16
    invoke-virtual {p0, p1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-object v1
.end method

.method private static final register$lambda$79(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x1e8d8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    :goto_0
    return v1

    :cond_1
    sget-object v2, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    new-instance v3, LO8;

    const/4 v4, 0x4

    invoke-direct {v3, v4, v0, p0}, LO8;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-direct {v2, v3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    return v1
.end method

.method private static final register$lambda$79$lambda$78(Ljava/lang/String;Ljava/lang/String;)LTC;
    .locals 2

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->viewRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of v1, p0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    check-cast p0, Landroid/view/ViewGroup;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    sget-object v1, LTC;->a:LTC;

    if-nez p0, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-nez p1, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-object v1
.end method

.method private static final register$lambda$81(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x1e8dafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    const-wide v2, -0x1e8dcfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    :cond_1
    sget-object v2, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    new-instance v3, LO8;

    const/4 v4, 0x3

    invoke-direct {v3, v4, v0, p0}, LO8;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-direct {v2, v3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    return v1
.end method

.method private static final register$lambda$81$lambda$80(Ljava/lang/String;Ljava/lang/String;)LTC;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->viewRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    instance-of v0, p0, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$82(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x1e8ddfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    sget-object v2, Lio/github/cherrywechat/lua/api/CherryViewAPI;->viewRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    instance-of v2, v1, Landroid/widget/TextView;

    if-eqz v2, :cond_1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_0
    return v0
.end method

.method private static final register$lambda$84(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x1e8dffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toBoolean(I)Z

    move-result p0

    sget-object v2, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    new-instance v3, LY8;

    invoke-direct {v3, v0, p0}, LY8;-><init>(Ljava/lang/String;Z)V

    invoke-direct {v2, v3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    return v1
.end method

.method private static final register$lambda$84$lambda$83(Ljava/lang/String;Z)LTC;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->viewRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    if-eqz p0, :cond_1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$86(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x1e8e1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    const-wide v2, -0x1e8e3fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    :cond_1
    sget-object v2, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    new-instance v3, LO8;

    const/4 v4, 0x2

    invoke-direct {v3, v4, v0, p0}, LO8;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-direct {v2, v3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    return v1
.end method

.method private static final register$lambda$86$lambda$85(Ljava/lang/String;Ljava/lang/String;)LTC;
    .locals 2

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->viewRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    if-eqz p0, :cond_0

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    const/4 v1, -0x1

    invoke-direct {v0, p1, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->parseColor(Ljava/lang/String;I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_0
    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$87(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x1e8ebfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    sget-object v2, Lio/github/cherrywechat/lua/api/CherryViewAPI;->viewRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_1

    sget-object v2, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v1, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_0
    return v0
.end method

.method private static final register$lambda$89(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x1e8fefffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    :goto_0
    return v1

    :cond_1
    sget-object v2, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    new-instance v3, LO8;

    const/4 v4, 0x5

    invoke-direct {v3, v4, v0, p0}, LO8;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-direct {v2, v3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    return v1
.end method

.method private static final register$lambda$89$lambda$88(Ljava/lang/String;Ljava/lang/String;)LTC;
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->viewRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/widget/ImageView;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    sget-object v0, LTC;->a:LTC;

    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    const-wide v1, -0x1e8edfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    const-wide v1, -0x1e8f5fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_3
    :goto_1
    return-object v0

    :cond_4
    :goto_2
    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v1, p0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->loadImageFromUrl(Landroid/widget/ImageView;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final register$lambda$92(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x1e880fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    new-instance v2, LS8;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, LS8;-><init>(Ljava/lang/String;I)V

    invoke-direct {v1, v2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    return v0
.end method

.method private static final register$lambda$92$lambda$91(Ljava/lang/String;)LTC;
    .locals 2

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->viewRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/ViewGroup;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$99(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x117ecfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v1, p0, v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->readConfig(Lparty/iroiro/luajava/Lua;I)Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    :cond_0
    sget-object v1, LLf;->a:LLf;

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v3, -0x117eefffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lio/github/cherrywechat/lua/api/CherryViewAPI;->windowIdCounter:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    new-instance v4, LN8;

    invoke-direct {v4, v2, v1}, LN8;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    invoke-direct {v3, v4}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThreadSync(LUi;)V

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v0
.end method

.method private static final register$lambda$99$lambda$98(Ljava/util/Map;Ljava/lang/String;)LTC;
    .locals 19

    move-object/from16 v0, p0

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v1}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v2

    sget-object v3, LTC;->a:LTC;

    if-eqz v2, :cond_1

    :cond_0
    move-object v5, v2

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentContext()Landroid/content/Context;

    move-result-object v2

    if-nez v2, :cond_0

    return-object v3

    :goto_0
    const-wide v1, -0x11749fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Number;

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    check-cast v1, Ljava/lang/Number;

    goto :goto_1

    :cond_2
    move-object v1, v4

    :goto_1
    const/4 v2, -0x2

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    sget-object v6, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v6, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->dp(I)I

    move-result v1

    move v7, v1

    goto :goto_2

    :cond_3
    move v7, v2

    :goto_2
    const-wide v8, -0x1174ffffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v6, v1, Ljava/lang/Number;

    if-eqz v6, :cond_4

    check-cast v1, Ljava/lang/Number;

    goto :goto_3

    :cond_4
    move-object v1, v4

    :goto_3
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    sget-object v2, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v2, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->dp(I)I

    move-result v2

    :cond_5
    move v8, v2

    const-wide v1, -0x11756fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Number;

    if-eqz v2, :cond_6

    check-cast v1, Ljava/lang/Number;

    goto :goto_4

    :cond_6
    move-object v1, v4

    :goto_4
    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    goto :goto_5

    :cond_7
    const/4 v1, 0x0

    :goto_5
    const-wide v9, -0x11758fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v6, v2, Ljava/lang/Number;

    if-eqz v6, :cond_8

    check-cast v2, Ljava/lang/Number;

    goto :goto_6

    :cond_8
    move-object v2, v4

    :goto_6
    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    goto :goto_7

    :cond_9
    const/16 v2, 0x64

    :goto_7
    const-wide v9, -0x1175afffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v6, v9}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    new-instance v16, Landroid/view/WindowManager$LayoutParams;

    const/16 v10, 0x208

    const/4 v11, -0x3

    const/16 v9, 0x7f6

    move-object/from16 v6, v16

    invoke-direct/range {v6 .. v11}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    const v7, 0x800033

    iput v7, v6, Landroid/view/WindowManager$LayoutParams;->gravity:I

    iput v1, v6, Landroid/view/WindowManager$LayoutParams;->x:I

    iput v2, v6, Landroid/view/WindowManager$LayoutParams;->y:I

    new-instance v15, Landroid/widget/FrameLayout;

    invoke-direct {v15, v5}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const-wide v1, -0x11764fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_a

    check-cast v1, Ljava/lang/String;

    goto :goto_8

    :cond_a
    move-object v1, v4

    :goto_8
    if-eqz v1, :cond_b

    sget-object v2, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    const-wide v7, -0x11774fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    invoke-direct {v2, v1, v7}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->parseColor(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v15, v1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_b
    const-wide v1, -0x1177efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Number;

    if-eqz v2, :cond_c

    check-cast v1, Ljava/lang/Number;

    goto :goto_9

    :cond_c
    move-object v1, v4

    :goto_9
    if-eqz v1, :cond_d

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    sget-object v2, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v2, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->dp(F)F

    move-result v1

    goto :goto_a

    :cond_d
    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    const/high16 v2, 0x41400000    # 12.0f

    invoke-direct {v1, v2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->dp(F)F

    move-result v1

    :goto_a
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    sget-object v7, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    const-wide v8, -0x1170bfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v8, v0, Ljava/lang/String;

    if-eqz v8, :cond_e

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    :cond_e
    const-wide v8, -0x1171bfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-direct {v7, v4, v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->parseColor(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v15, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    move-object/from16 v16, v6

    if-nez v12, :cond_f

    new-instance v6, LHv;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v8, LHv;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    new-instance v9, LGv;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    new-instance v10, LGv;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    new-instance v4, LR8;

    move-object v11, v15

    move-object/from16 v7, v16

    invoke-direct/range {v4 .. v11}, LR8;-><init>(Landroid/content/Context;LHv;Landroid/view/WindowManager$LayoutParams;LHv;LGv;LGv;Landroid/widget/FrameLayout;)V

    invoke-virtual {v15, v4}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_f
    const-wide v0, -0x11725fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-wide v1, -0x1172cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-object/from16 v17, v0

    check-cast v17, Landroid/view/WindowManager;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->floatingWindows:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v13, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;

    const/16 v18, 0x0

    move-object/from16 v14, p1

    invoke-direct/range {v13 .. v18}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;-><init>(Ljava/lang/String;Landroid/widget/FrameLayout;Landroid/view/WindowManager$LayoutParams;Landroid/view/WindowManager;Z)V

    invoke-interface {v0, v14, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v3
.end method

.method private static final register$lambda$99$lambda$98$lambda$97(Landroid/content/Context;LHv;Landroid/view/WindowManager$LayoutParams;LHv;LGv;LGv;Landroid/widget/FrameLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    const-wide v0, -0x1e882fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p7

    invoke-virtual {p0, p7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    const-wide v0, -0x1e889fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p0, Landroid/view/WindowManager;

    invoke-virtual {p8}, Landroid/view/MotionEvent;->getAction()I

    move-result p7

    const/4 v0, 0x1

    if-eqz p7, :cond_1

    const/4 v1, 0x2

    if-eq p7, v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    iget p1, p1, LHv;->a:I

    invoke-virtual {p8}, Landroid/view/MotionEvent;->getRawX()F

    move-result p7

    iget p4, p4, LGv;->a:F

    sub-float/2addr p7, p4

    float-to-int p4, p7

    add-int/2addr p1, p4

    iput p1, p2, Landroid/view/WindowManager$LayoutParams;->x:I

    iget p1, p3, LHv;->a:I

    invoke-virtual {p8}, Landroid/view/MotionEvent;->getRawY()F

    move-result p3

    iget p4, p5, LGv;->a:F

    sub-float/2addr p3, p4

    float-to-int p3, p3

    add-int/2addr p1, p3

    iput p1, p2, Landroid/view/WindowManager$LayoutParams;->y:I

    invoke-interface {p0, p6, p2}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return v0

    :cond_1
    iget p0, p2, Landroid/view/WindowManager$LayoutParams;->x:I

    iput p0, p1, LHv;->a:I

    iget p0, p2, Landroid/view/WindowManager$LayoutParams;->y:I

    iput p0, p3, LHv;->a:I

    invoke-virtual {p8}, Landroid/view/MotionEvent;->getRawX()F

    move-result p0

    iput p0, p4, LGv;->a:F

    invoke-virtual {p8}, Landroid/view/MotionEvent;->getRawY()F

    move-result p0

    iput p0, p5, LGv;->a:F

    return v0
.end method

.method private final runOnUiThread(LUi;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LUi;",
            ")V"
        }
    .end annotation

    sget-object v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->INSTANCE:Lio/github/cherrywechat/lua/LuaUiScheduler;

    invoke-virtual {v0, p1}, Lio/github/cherrywechat/lua/LuaUiScheduler;->runOnUiThread(LUi;)V

    return-void
.end method

.method private final runOnUiThreadSync(LUi;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LUi;",
            ")V"
        }
    .end annotation

    sget-object v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->INSTANCE:Lio/github/cherrywechat/lua/LuaUiScheduler;

    invoke-virtual {v0, p1}, Lio/github/cherrywechat/lua/LuaUiScheduler;->runOnUiThreadSync(LUi;)Z

    move-result p1

    if-nez p1, :cond_0

    const-wide v0, -0x1eb5dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1eb6bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static synthetic s(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$32$lambda$31$lambda$30(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s0(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$11(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private static final setImageSource$lambda$133(Ljava/lang/String;Ljava/lang/String;)LTC;
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->viewRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/widget/ImageView;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    sget-object v0, LTC;->a:LTC;

    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    const-wide v1, -0x1157bfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    const-wide v1, -0x11503fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_3
    :goto_1
    return-object v0

    :cond_4
    :goto_2
    sget-object v1, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-direct {v1, p0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->loadImageFromUrl(Landroid/widget/ImageView;Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic t(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$114(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic t0(Ljava/lang/String;Ljava/lang/String;)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$89$lambda$88(Ljava/lang/String;Ljava/lang/String;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lparty/iroiro/luajava/Lua;ILandroid/widget/EditText;)LTC;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$18$lambda$17$lambda$14$lambda$13(Lparty/iroiro/luajava/Lua;ILandroid/widget/EditText;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u0(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$11$lambda$10$lambda$9$lambda$8(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$77(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic v0(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p1, p0, p2, p3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$11$lambda$10$lambda$9(Lparty/iroiro/luajava/Lua;ILandroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic w(Ljava/lang/String;Ljava/lang/String;)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$86$lambda$85(Ljava/lang/String;Ljava/lang/String;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w0(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$69(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic x(Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p1, p2, p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$lambda$51(Lparty/iroiro/luajava/Lua;ILjava/lang/String;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x0(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$86(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic y(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$130$lambda$129$lambda$128$lambda$127$lambda$126$lambda$125(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y0(Ljava/lang/String;Ljava/lang/String;)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->setImageSource$lambda$133(Ljava/lang/String;Ljava/lang/String;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Ljava/lang/String;II)LTC;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$112$lambda$111(Ljava/lang/String;II)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z0(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register$lambda$5$lambda$4$lambda$3(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V

    return-void
.end method


# virtual methods
.method public final cleanup()V
    .locals 2

    new-instance v0, Ld;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Ld;-><init>(I)V

    invoke-direct {p0, v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    const-wide v0, -0x1eb14fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1eb22fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final register(Lparty/iroiro/luajava/Lua;)V
    .locals 4

    const-wide v0, -0x1ee05fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x0

    const/16 v1, 0x32

    invoke-interface {p1, v0, v1}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    new-instance v0, LK8;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, LK8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1ee09fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LK8;

    const/16 v2, 0x1d

    invoke-direct {v0, v2}, LK8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ee0ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LW8;

    const/16 v2, 0xa

    invoke-direct {v0, v2}, LW8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ee19fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LW8;

    const/16 v2, 0x12

    invoke-direct {v0, v2}, LW8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ee25fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LW8;

    const/16 v2, 0x13

    invoke-direct {v0, v2}, LW8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ee30fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LW8;

    const/16 v2, 0x14

    invoke-direct {v0, v2}, LW8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ee3bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LW8;

    const/16 v2, 0x15

    invoke-direct {v0, v2}, LW8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1eec3fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LW8;

    const/16 v2, 0x16

    invoke-direct {v0, v2}, LW8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1eed1fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LW8;

    const/16 v2, 0x17

    invoke-direct {v0, v2}, LW8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1eeddfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LW8;

    const/16 v2, 0x18

    invoke-direct {v0, v2}, LW8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1eee8fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LK8;

    const/16 v2, 0x13

    invoke-direct {v0, v2}, LK8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1eef6fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LK8;

    const/16 v2, 0x14

    invoke-direct {v0, v2}, LK8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ee81fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LK8;

    const/16 v2, 0x15

    invoke-direct {v0, v2}, LK8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ee90fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LK8;

    const/16 v2, 0x16

    invoke-direct {v0, v2}, LK8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1eea0fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LK8;

    const/16 v2, 0x17

    invoke-direct {v0, v2}, LK8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1eeadfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LK8;

    const/16 v2, 0x18

    invoke-direct {v0, v2}, LK8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1eebcfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LK8;

    const/16 v2, 0x19

    invoke-direct {v0, v2}, LK8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ed4ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LK8;

    const/16 v2, 0x1a

    invoke-direct {v0, v2}, LK8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ed61fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LK8;

    const/16 v2, 0x1b

    invoke-direct {v0, v2}, LK8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ed72fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LK8;

    const/16 v2, 0x1c

    invoke-direct {v0, v2}, LK8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ed7bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LW8;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, LW8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ed07fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LW8;

    const/4 v2, 0x1

    invoke-direct {v0, v2}, LW8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ed0ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LW8;

    const/4 v2, 0x2

    invoke-direct {v0, v2}, LW8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ed17fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LW8;

    const/4 v2, 0x3

    invoke-direct {v0, v2}, LW8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ed22fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LW8;

    const/4 v2, 0x4

    invoke-direct {v0, v2}, LW8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ed35fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LW8;

    const/4 v2, 0x5

    invoke-direct {v0, v2}, LW8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ed3dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LW8;

    const/4 v2, 0x6

    invoke-direct {v0, v2}, LW8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1edc9fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LW8;

    const/4 v2, 0x7

    invoke-direct {v0, v2}, LW8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1edd5fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LW8;

    const/16 v2, 0x8

    invoke-direct {v0, v2}, LW8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1edeafffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LW8;

    const/16 v2, 0x9

    invoke-direct {v0, v2}, LW8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1edfbfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LW8;

    const/16 v2, 0xb

    invoke-direct {v0, v2}, LW8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ed86fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LW8;

    const/16 v2, 0xc

    invoke-direct {v0, v2}, LW8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ed91fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LW8;

    const/16 v2, 0xd

    invoke-direct {v0, v2}, LW8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ed9ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LW8;

    const/16 v2, 0xe

    invoke-direct {v0, v2}, LW8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1edb4fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LW8;

    const/16 v2, 0xf

    invoke-direct {v0, v2}, LW8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ec45fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LW8;

    const/16 v2, 0x10

    invoke-direct {v0, v2}, LW8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ec56fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LW8;

    const/16 v2, 0x11

    invoke-direct {v0, v2}, LW8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ec68fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    const-wide v0, -0x1ec79fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1ec07fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final setImageSource(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-wide v0, -0x1eb09fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1eb10fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, LO8;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1, p2}, LO8;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->runOnUiThread(LUi;)V

    return-void
.end method
