.class public LYue/ۥۢۤ۟۟;
.super Landroid/app/Dialog;


# static fields
.field public static volatile synthetic ۥ۟۟ۡ۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡۢ:Ljava/lang/String;

.field public static volatile synthetic ۥۣ۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡۦ:Ljava/lang/String;


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۢۤ۟ۧ;

.field public final ۥ۟۟۠ۤ:Ljava/lang/String;

.field public ۥ۟۟۠ۥ:Ljava/lang/String;

.field public ۥ۟۟۠ۦ:Ljava/lang/String;

.field public ۥ۟۟۠ۧ:Ljava/lang/String;

.field public ۥ۟۟۠ۨ:Ljava/lang/String;

.field public final ۥ۟۟ۡ:LYue/ۥ۟ۢۨۦ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xcb

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LYue/ۥۢۤ۟ۧ;Ljava/lang/String;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۢۤ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, LYue/ۥۢۤ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    iput-object p2, p0, LYue/ۥۢۤ۟۟;->ۥۣ۟۟۠:LYue/ۥۢۤ۟ۧ;

    new-instance p1, LYue/ۥ۟ۢۨۦ;

    invoke-direct {p1}, LYue/ۥ۟ۢۨۦ;-><init>()V

    iput-object p1, p0, LYue/ۥۢۤ۟۟;->ۥ۟۟ۡ:LYue/ۥ۟ۢۨۦ;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native synthetic ۥ(LYue/ۥۢۤ۟۟;Landroid/view/View;)V
.end method

.method public static native synthetic ۥ۟(LYue/ۥۢۤ۟۟;Landroid/widget/TextView;)V
.end method

.method public static native synthetic ۥ۟۟(LYue/ۥۢۤ۟۟;Ljava/lang/String;)V
.end method

.method public static native synthetic ۥ۟۟۟(LYue/ۥۢۤ۟۟;Landroid/view/View;)V
.end method

.method public static native synthetic ۥ۟۟۟۟(LYue/ۥۢۤ۟۟;Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkList;I)V
.end method


# virtual methods
.method public native onCreate(Landroid/os/Bundle;)V
.end method

.method public final native ۥ۟۟۟۠(Landroid/widget/LinearLayout;)V
.end method

.method public native ۥ۟۟۟ۡ()Ljava/lang/String;
.end method

.method public native ۥ۟۟۟ۢ()Ljava/lang/String;
.end method

.method public native ۥۣ۟۟۟()Ljava/lang/String;
.end method

.method public native ۥ۟۟۟ۤ()Ljava/lang/String;
.end method

.method public final native synthetic ۥ۟۟۟ۥ(Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkList;I)V
.end method

.method public final native synthetic ۥ۟۟۟ۦ(Landroid/widget/TextView;)V
.end method

.method public final native synthetic ۥ۟۟۟ۧ(Ljava/lang/String;)V
.end method

.method public final native synthetic ۥ۟۟۟ۨ(Landroid/view/View;)V
.end method

.method public final native synthetic ۥ۟۟۠(Landroid/view/View;)V
.end method

.method public native ۥ۟۟۠۟(Ljava/lang/String;)V
.end method

.method public native ۥ۟۟۠۠(Ljava/lang/String;)V
.end method

.method public native ۥ۟۟۠ۡ(Ljava/lang/String;)V
.end method

.method public native ۥ۟۟۠ۢ(Ljava/lang/String;)V
.end method
