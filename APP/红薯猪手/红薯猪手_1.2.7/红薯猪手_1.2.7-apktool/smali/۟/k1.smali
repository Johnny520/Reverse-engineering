.class public final L۟/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements L۟/z9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "L\u06df/z9<",
        "L\u06df/g4;",
        ">;"
    }
.end annotation


# instance fields
.field public final ۥ:Ljava/lang/CharSequence;

.field public final ۥ۟:I

.field public final ۥ۟۟:I

.field public final ۥ۟۠:L۟/h3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u06df/h3<",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/Integer;",
            "L\u06df/q7<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;IIL۟/ua;)V
    .locals 1

    const-string v0, "input"

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, L۟/k1;->ۥ:Ljava/lang/CharSequence;

    iput p2, p0, L۟/k1;->ۥ۟:I

    iput p3, p0, L۟/k1;->ۥ۟۟:I

    iput-object p4, p0, L۟/k1;->ۥ۟۠:L۟/h3;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "L\u06df/g4;",
            ">;"
        }
    .end annotation

    new-instance v0, L۟/k1$a;

    invoke-direct {v0, p0}, L۟/k1$a;-><init>(L۟/k1;)V

    return-object v0
.end method
