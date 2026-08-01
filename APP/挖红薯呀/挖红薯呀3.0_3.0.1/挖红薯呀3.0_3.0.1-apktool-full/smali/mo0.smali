.class public final synthetic Lmo0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lhw;


# direct methods
.method public synthetic constructor <init>(ILhw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lmo0;->d:I

    .line 5
    .line 6
    iput-object p2, p0, Lmo0;->e:Lhw;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lkm;

    .line 2
    .line 3
    iget v1, p0, Lmo0;->d:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, Lmo0;->e:Lhw;

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, p0}, Lkm;-><init>(IFLhw;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
