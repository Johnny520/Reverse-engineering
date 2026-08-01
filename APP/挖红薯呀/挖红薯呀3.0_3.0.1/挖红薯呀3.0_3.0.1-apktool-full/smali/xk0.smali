.class public final synthetic Lxk0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final synthetic d:Ls90;

.field public final synthetic e:Lgm;


# direct methods
.method public synthetic constructor <init>(Ls90;Lgm;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxk0;->d:Ls90;

    .line 5
    .line 6
    iput-object p2, p0, Lxk0;->e:Lgm;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lxk0;->d:Ls90;

    .line 2
    .line 3
    iget-object p0, p0, Lxk0;->e:Lgm;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ls90;->b(Lw90;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
