.class public final La/O6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/Q3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La/Q3<",
        "La/R6$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:La/H2;


# direct methods
.method public constructor <init>(La/H2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/O6;->a:La/H2;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, La/R6$a;

    if-nez p1, :cond_0

    new-instance p1, La/R6$a;

    const/4 v0, -0x3

    invoke-direct {p1, v0}, La/R6$a;-><init>(I)V

    :cond_0
    iget-object v0, p0, La/O6;->a:La/H2;

    invoke-virtual {v0, p1}, La/H2;->a(La/R6$a;)V

    return-void
.end method
