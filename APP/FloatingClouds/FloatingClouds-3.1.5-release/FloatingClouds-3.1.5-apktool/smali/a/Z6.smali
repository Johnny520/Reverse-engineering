.class public abstract La/Z6;
.super La/a2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<H:",
        "Ljava/lang/Object;",
        ">",
        "La/a2;"
    }
.end annotation


# instance fields
.field public final a:La/X6;

.field public final b:La/X6;

.field public final c:Landroid/os/Handler;

.field public final d:La/i7;


# direct methods
.method public constructor <init>(La/X6;)V
    .locals 1

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/Z6;->a:La/X6;

    iput-object p1, p0, La/Z6;->b:La/X6;

    iput-object v0, p0, La/Z6;->c:Landroid/os/Handler;

    new-instance p1, La/i7;

    invoke-direct {p1}, La/e7;-><init>()V

    iput-object p1, p0, La/Z6;->d:La/i7;

    return-void
.end method
