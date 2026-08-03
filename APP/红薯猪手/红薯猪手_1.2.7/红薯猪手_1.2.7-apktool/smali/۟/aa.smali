.class public final L۟/aa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements L۟/n4;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Ljava/lang/Object;",
        ">;",
        "L\u06df/n4;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/z9;


# direct methods
.method public constructor <init>(L۟/k1;)V
    .locals 0

    iput-object p1, p0, L۟/aa;->ۥ:L۟/z9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, L۟/aa;->ۥ:L۟/z9;

    invoke-interface {v0}, L۟/z9;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
