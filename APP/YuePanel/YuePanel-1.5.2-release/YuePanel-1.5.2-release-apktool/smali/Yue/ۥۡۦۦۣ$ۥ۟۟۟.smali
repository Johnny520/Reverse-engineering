.class public LYue/ۥۡۦۦۣ$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۦۦۣ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:Landroid/content/res/ColorStateList;

.field public final ۥ۟:Landroid/content/res/Configuration;

.field public final ۥ۟۟:I


# direct methods
.method public constructor <init>(Landroid/content/res/ColorStateList;Landroid/content/res/Configuration;Landroid/content/res/Resources$Theme;)V
    .locals 0
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/content/res/Configuration;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroid/content/res/Resources$Theme;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۦۦۣ$ۥ۟۟۟;->ۥ:Landroid/content/res/ColorStateList;

    iput-object p2, p0, LYue/ۥۡۦۦۣ$ۥ۟۟۟;->ۥ۟:Landroid/content/res/Configuration;

    if-nez p3, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Ljava/lang/Object;->hashCode()I

    move-result p1

    :goto_0
    iput p1, p0, LYue/ۥۡۦۦۣ$ۥ۟۟۟;->ۥ۟۟:I

    return-void
.end method
