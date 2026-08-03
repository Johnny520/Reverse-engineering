.class public LYue/ۥۡۡ۟ۦ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۡ۟ۦ;->load(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۨ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ۟:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۡۡ۟ۦ;


# direct methods
.method public constructor <init>(LYue/ۥۡۡ۟ۦ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۡ۟ۦ$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۡ۟ۦ;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, LYue/ۥۡۡ۟ۦ$ۥ;->ۥ۟۟ۡ۟:Ljava/lang/String;

    if-nez p0, :cond_0

    const-wide v0, -0x13cf064f4abbb4bcL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۡ۟ۦ$ۥ;->ۥ۟۟ۡ۟:Ljava/lang/String;

    :cond_0
    return-object p0

    :pswitch_1
    sget-object p0, LYue/ۥۡۡ۟ۦ$ۥ;->ۥ۟۟ۡ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, -0x7f0dd3ae1ac15d3dL    # -4.140702160140271E-304

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۡ۟ۦ$ۥ;->ۥ۟۟ۡ:Ljava/lang/String;

    :cond_1
    return-object p0

    :pswitch_2
    sget-object p0, LYue/ۥۡۡ۟ۦ$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_2

    const-wide v0, -0x29a2fe971bab7fc5L    # -1.0643854342613257E108

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۡ۟ۦ$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_2
    return-object p0

    :pswitch_3
    sget-object p0, LYue/ۥۡۡ۟ۦ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x739c50091e9b1f4bL    # 7.918388206948002E248

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۡ۟ۦ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_3
    return-object p0

    :pswitch_4
    sget-object p0, LYue/ۥۡۡ۟ۦ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_4

    const-wide v0, 0x612636183a4072bcL    # 9.75847229301669E159

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۡ۟ۦ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_4
    return-object p0

    :pswitch_5
    sget-object p0, LYue/ۥۡۡ۟ۦ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, -0x65d00ce1842dbfdfL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۡ۟ۦ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_5
    return-object p0

    :pswitch_6
    sget-object p0, LYue/ۥۡۡ۟ۦ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_6

    const-wide v0, -0xe8897e17ae73de3L    # -3.810456984690885E238

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۡ۟ۦ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_6
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic ۥ(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, LYue/ۥۡۡ۟ۦ$ۥ;->ۥ۟۟۟۠(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟(Lcom/kongzue/dialogx/dialogs/InputDialog;Landroid/view/View;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1, p2}, LYue/ۥۡۡ۟ۦ$ۥ;->ۥ۟۟۟۟(Lcom/kongzue/dialogx/dialogs/InputDialog;Landroid/view/View;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟۟۟۟(Lcom/kongzue/dialogx/dialogs/InputDialog;Landroid/view/View;Ljava/lang/String;)Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic ۥ۟۟۟۠(Landroid/view/View;)V
    .locals 4

    new-instance p0, Lcom/kongzue/dialogx/dialogs/InputDialog;

    const/4 v0, 0x3

    invoke-static {v0}, LYue/ۥۡۡ۟ۦ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, LYue/ۥۡۡ۟ۦ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x5

    invoke-static {v2}, LYue/ۥۡۡ۟ۦ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v3}, LYue/ۥۡۡ۟ۦ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/kongzue/dialogx/dialogs/InputDialog;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/dialogs/InputDialog;->setCancelable(Z)Lcom/kongzue/dialogx/dialogs/InputDialog;

    move-result-object p0

    new-instance v0, LYue/ۥۡۡ۟ۥ;

    invoke-direct {v0}, LYue/ۥۡۡ۟ۥ;-><init>()V

    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/dialogs/InputDialog;->setOkButton(Lcom/kongzue/dialogx/interfaces/OnInputDialogButtonClickListener;)Lcom/kongzue/dialogx/dialogs/InputDialog;

    move-result-object p0

    invoke-virtual {p0}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->show()Lcom/kongzue/dialogx/dialogs/MessageDialog;

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    check-cast p1, Landroid/view/ViewGroup;

    invoke-static {p1}, LYue/ۥۢۤۧۧ;->ۥ۟۟۟ۢ(Landroid/view/View;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    instance-of v5, v3, Landroid/widget/TextView;

    if-eqz v5, :cond_0

    check-cast v3, Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1}, LYue/ۥۡۡ۟ۦ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v2, v4

    goto :goto_0

    :cond_1
    if-eqz v2, :cond_2

    return-void

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v4}, LYue/ۥۡۡ۟ۦ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    const-class v3, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {v3, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v3, v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    const/4 v3, -0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v5, v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v5, 0x64

    invoke-direct {v4, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    new-instance v5, Landroid/widget/ImageView;

    invoke-direct {v5, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    sget v6, Lcom/yuexin/panel/R$ۥ۟۟;->ۥ۟۟ۡۨ:I

    invoke-virtual {v5, v6}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-virtual {v5, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {v1}, LYue/ۥۡۡ۟ۦ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v0, 0x41200000    # 10.0f

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v0, LYue/ۥۡۡ۟ۤ;

    invoke-direct {v0}, LYue/ۥۡۡ۟ۤ;-><init>()V

    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p1, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_3
    new-instance p1, Ljava/lang/ClassCastException;

    const/4 v0, 0x2

    invoke-static {v0}, LYue/ۥۡۡ۟ۦ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
