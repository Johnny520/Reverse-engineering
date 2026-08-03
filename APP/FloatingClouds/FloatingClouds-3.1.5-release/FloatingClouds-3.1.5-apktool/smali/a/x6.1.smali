.class public final La/x6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/Pd;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "La/Pd<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:La/Bf;

.field public final b:La/kd;


# direct methods
.method public constructor <init>(La/Bf;La/kd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/x6;->a:La/Bf;

    iput-object p2, p0, La/x6;->b:La/kd;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, La/x6$a;

    invoke-direct {v0, p0}, La/x6$a;-><init>(La/x6;)V

    return-object v0
.end method
