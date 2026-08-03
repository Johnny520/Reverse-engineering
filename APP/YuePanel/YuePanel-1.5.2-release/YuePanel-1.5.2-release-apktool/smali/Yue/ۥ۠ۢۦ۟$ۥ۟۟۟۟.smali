.class public final LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۢۦ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:Landroid/graphics/Typeface;

.field public final ۥ۟:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;->ۥ:Landroid/graphics/Typeface;

    .line 3
    iput p1, p0, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;->ۥ۟:I

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Typeface;)V
    .locals 0
    .param p1    # Landroid/graphics/Typeface;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;->ۥ:Landroid/graphics/Typeface;

    const/4 p1, 0x0

    .line 6
    iput p1, p0, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;->ۥ۟:I

    return-void
.end method


# virtual methods
.method public ۥ()Z
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    iget v0, p0, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;->ۥ۟:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
