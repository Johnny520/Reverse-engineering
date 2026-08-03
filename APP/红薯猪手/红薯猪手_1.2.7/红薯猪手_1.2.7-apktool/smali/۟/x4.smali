.class public final L۟/x4;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/f3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/f3<",
        "Landroid/widget/ProgressBar;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, L۟/x4;->ۥ:Landroid/content/Context;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/lang/Object;
    .locals 2

    new-instance v0, Landroid/widget/ProgressBar;

    iget-object v1, p0, L۟/x4;->ۥ:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
