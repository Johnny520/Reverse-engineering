.class public final Lwi1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lhr0;


# static fields
.field public static final μ:Lwi1;


# instance fields
.field public ε:I

.field public ζ:I

.field public η:Z

.field public θ:Z

.field public ι:Landroid/os/Handler;

.field public final κ:Ljr0;

.field public final λ:Lν;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lwi1;

    .line 2
    .line 3
    invoke-direct {v0}, Lwi1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lwi1;->μ:Lwi1;

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
    iput-boolean v0, p0, Lwi1;->η:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lwi1;->θ:Z

    .line 8
    .line 9
    new-instance v0, Ljr0;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Ljr0;-><init>(Lhr0;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lwi1;->κ:Ljr0;

    .line 15
    .line 16
    new-instance v0, Lν;

    .line 17
    .line 18
    const/16 v1, 0x18

    .line 19
    .line 20
    invoke-direct {v0, v1, p0}, Lν;-><init>(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lwi1;->λ:Lν;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final δ()Ljr0;
    .locals 0

    .line 1
    iget-object p0, p0, Lwi1;->κ:Ljr0;

    .line 2
    .line 3
    return-object p0
.end method
