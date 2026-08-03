.class public final LYue/ۥۣۢۢۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1a
.end annotation


# static fields
.field public static final ۥ:LYue/ۥۣۢۢۤ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۣۢۢۤ;

    invoke-direct {v0}, LYue/ۥۣۢۢۤ;-><init>()V

    sput-object v0, LYue/ۥۣۢۢۤ;->ۥ:LYue/ۥۣۢۢۤ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final ۥ(Landroid/content/res/TypedArray;I)Landroid/graphics/Typeface;
    .locals 0
    .param p0    # Landroid/content/res/TypedArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # I
        .annotation build LYue/ۥۣۣۢ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->getFont(I)Landroid/graphics/Typeface;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    return-object p0
.end method
