.class public LYue/ۥۡۢۦۤ$ۥ۟۟۟ۦ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۢۦۤ$ۥ۟۟۟ۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:Landroid/content/ComponentName;

.field public ۥ۟:Z

.field public ۥ۟۟:LYue/ۥ۠ۥ۟ۢ;

.field public ۥ۟۟۟:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "LYue/\u06e5\u06e1\u06e2\u06e6\u06e4$\u06e5\u06df\u06df\u06df\u06e7;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟۟:I


# direct methods
.method public constructor <init>(Landroid/content/ComponentName;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۡۢۦۤ$ۥ۟۟۟ۦ$ۥ;->ۥ۟:Z

    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v1, p0, LYue/ۥۡۢۦۤ$ۥ۟۟۟ۦ$ۥ;->ۥ۟۟۟:Ljava/util/ArrayDeque;

    iput v0, p0, LYue/ۥۡۢۦۤ$ۥ۟۟۟ۦ$ۥ;->ۥ۟۟۟۟:I

    iput-object p1, p0, LYue/ۥۡۢۦۤ$ۥ۟۟۟ۦ$ۥ;->ۥ:Landroid/content/ComponentName;

    return-void
.end method
