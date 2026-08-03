.class public final La/Bf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/Pd;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "La/Pd<",
        "TR;>;"
    }
.end annotation


# instance fields
.field public final a:La/M1;

.field public final b:La/D7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/D7<",
            "TT;TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(La/M1;La/D7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/Bf;->a:La/M1;

    iput-object p2, p0, La/Bf;->b:La/D7;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TR;>;"
        }
    .end annotation

    new-instance v0, La/Bf$a;

    invoke-direct {v0, p0}, La/Bf$a;-><init>(La/Bf;)V

    return-object v0
.end method
