.class public final La/Sd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements La/q9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Ljava/lang/Object;",
        ">;",
        "La/q9;"
    }
.end annotation


# instance fields
.field public final synthetic a:La/S4;


# direct methods
.method public constructor <init>(La/S4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/Sd;->a:La/S4;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, La/Sd;->a:La/S4;

    new-instance v1, La/S4$a;

    invoke-direct {v1, v0}, La/S4$a;-><init>(La/S4;)V

    return-object v1
.end method
