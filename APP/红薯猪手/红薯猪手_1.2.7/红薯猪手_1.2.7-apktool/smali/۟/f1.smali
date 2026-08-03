.class public final L۟/f1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final ۥ:L۟/bb$b;

.field public final ۥ۟:Landroid/content/Context;

.field public final ۥ۟۟:Ljava/lang/String;

.field public final ۥ۟۠:L۟/a9$b;

.field public final ۥ۟ۡ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟ۢ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "L\u06df/z;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥۣ۟:I

.field public final ۥ۟ۤ:Ljava/util/concurrent/Executor;

.field public final ۥ۟ۥ:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;L۟/d3;L۟/a9$b;ILjava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "LambdaLast"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, L۟/f1;->ۥ:L۟/bb$b;

    iput-object p1, p0, L۟/f1;->ۥ۟:Landroid/content/Context;

    iput-object p2, p0, L۟/f1;->ۥ۟۟:Ljava/lang/String;

    iput-object p4, p0, L۟/f1;->ۥ۟۠:L۟/a9$b;

    iput p5, p0, L۟/f1;->ۥۣ۟:I

    iput-object p6, p0, L۟/f1;->ۥ۟ۤ:Ljava/util/concurrent/Executor;

    const/4 p1, 0x0

    iput-boolean p1, p0, L۟/f1;->ۥ۟ۥ:Z

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, L۟/f1;->ۥ۟ۡ:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, L۟/f1;->ۥ۟ۢ:Ljava/util/List;

    return-void
.end method
