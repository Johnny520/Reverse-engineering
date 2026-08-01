.class public final Los0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lx90;


# static fields
.field public static final k:Los0;


# instance fields
.field public d:I

.field public e:I

.field public f:Z

.field public g:Z

.field public h:Landroid/os/Handler;

.field public final i:Lz90;

.field public final j:Lx3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Los0;

    .line 2
    .line 3
    invoke-direct {v0}, Los0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Los0;->k:Los0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Los0;->f:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Los0;->g:Z

    .line 8
    .line 9
    new-instance v1, Lz90;

    .line 10
    .line 11
    invoke-direct {v1, p0, v0}, Lz90;-><init>(Lx90;Z)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Los0;->i:Lz90;

    .line 15
    .line 16
    new-instance v0, Lx3;

    .line 17
    .line 18
    const/4 v1, 0x6

    .line 19
    invoke-direct {v0, v1, p0}, Lx3;-><init>(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Los0;->j:Lx3;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final getLifecycle()Ls90;
    .locals 0

    .line 1
    iget-object p0, p0, Los0;->i:Lz90;

    .line 2
    .line 3
    return-object p0
.end method
