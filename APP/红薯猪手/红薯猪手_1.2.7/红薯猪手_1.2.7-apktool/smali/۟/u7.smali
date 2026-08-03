.class public final L۟/u7;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/f3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/f3<",
        "L\u06df/t7$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/t7;


# direct methods
.method public constructor <init>(L۟/t7;)V
    .locals 0

    iput-object p1, p0, L۟/u7;->ۥ:L۟/t7;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/lang/Object;
    .locals 4

    new-instance v0, L۟/t7$a;

    iget-object v1, p0, L۟/u7;->ۥ:L۟/t7;

    new-instance v2, L۟/q1;

    const/4 v3, 0x5

    invoke-direct {v2, v3, v1}, L۟/q1;-><init>(ILjava/lang/Object;)V

    invoke-direct {v0, v1, v2}, L۟/t7$a;-><init>(L۟/t7;L۟/q1;)V

    return-object v0
.end method
