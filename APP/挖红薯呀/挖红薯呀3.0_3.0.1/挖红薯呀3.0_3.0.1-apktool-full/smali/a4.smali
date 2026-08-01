.class public final La4;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lf01;


# instance fields
.field public d:Z

.field public final synthetic e:Lx01;


# direct methods
.method public constructor <init>(Lx01;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La4;->e:Lx01;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Le01;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p1, p0, La4;->e:Lx01;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, La4;->d:Z

    .line 7
    .line 8
    :cond_0
    return-void
.end method
