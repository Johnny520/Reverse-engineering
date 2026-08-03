.class public final La/T7;
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
.field public final a:La/A3;

.field public final b:La/D7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/D7<",
            "TT;TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(La/A3;La/D7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/T7;->a:La/A3;

    iput-object p2, p0, La/T7;->b:La/D7;

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

    new-instance v0, La/T7$a;

    invoke-direct {v0, p0}, La/T7$a;-><init>(La/T7;)V

    return-object v0
.end method
