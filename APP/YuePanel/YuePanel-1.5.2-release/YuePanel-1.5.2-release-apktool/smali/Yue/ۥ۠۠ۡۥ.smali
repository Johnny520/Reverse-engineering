.class public LYue/ۥ۠۠ۡۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠۠ۡۥ$ۥ۟;,
        LYue/ۥ۠۠ۡۥ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ:[I

.field public static final ۥ۟:[I

.field public static final ۥ۟۟:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const v0, 0x10100a0

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, LYue/ۥ۠۠ۡۥ;->ۥ:[I

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, LYue/ۥ۠۠ۡۥ;->ۥ۟:[I

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    sput-object v0, LYue/ۥ۠۠ۡۥ;->ۥ۟۟:Landroid/graphics/Rect;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/graphics/drawable/Drawable;)Z
    .locals 0
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p0, 0x1

    return p0
.end method

.method public static ۥ۟(Landroid/graphics/drawable/Drawable;)V
    .locals 3
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_0

    const/16 v2, 0x1f

    if-ge v1, v2, :cond_0

    const-string v1, "android.graphics.drawable.ColorStateListDrawable"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LYue/ۥ۠۠ۡۥ;->ۥ۟۟(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public static ۥ۟۟(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v0

    if-eqz v0, :cond_1

    array-length v1, v0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, LYue/ۥ۠۠ۡۥ;->ۥ۟:[I

    invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v1, LYue/ۥ۠۠ۡۥ;->ۥ:[I

    invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :goto_1
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    return-void
.end method

.method public static ۥ۟۟۟(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;
    .locals 4
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥ۠۠ۡۥ$ۥ۟;->ۥ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Insets;

    move-result-object p0

    new-instance v0, Landroid/graphics/Rect;

    invoke-static {p0}, LYue/ۥ۠۠ۡ۟;->ۥ(Landroid/graphics/Insets;)I

    move-result v1

    invoke-static {p0}, LYue/ۥ۠۠ۡۡ;->ۥ(Landroid/graphics/Insets;)I

    move-result v2

    invoke-static {p0}, LYue/ۥۣ۠۠ۡ;->ۥ(Landroid/graphics/Insets;)I

    move-result v3

    invoke-static {p0}, LYue/ۥ۠۠ۡۤ;->ۥ(Landroid/graphics/Insets;)I

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0

    :cond_0
    invoke-static {p0}, LYue/ۥ۠۠۠ۥ;->ۥ۟۟۠۠(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠۠ۡۥ$ۥ;->ۥ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟۟(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
    .locals 1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x5

    if-eq p0, v0, :cond_1

    const/16 v0, 0x9

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    return-object p1

    :pswitch_0
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->ADD:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_1
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SCREEN:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_2
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :cond_0
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :cond_1
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :cond_2
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
