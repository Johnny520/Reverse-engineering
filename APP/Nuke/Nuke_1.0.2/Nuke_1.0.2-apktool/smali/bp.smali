.class public abstract Lbp;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lp41;
.implements Ljava/io/Serializable;


# instance fields
.field public transient h:Lp41;

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Class;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;

.field public final m:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbp;->i:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lbp;->j:Ljava/lang/Class;

    .line 7
    .line 8
    iput-object p3, p0, Lbp;->k:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lbp;->l:Ljava/lang/String;

    .line 11
    .line 12
    iput-boolean p5, p0, Lbp;->m:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public abstract d()Lp41;
.end method

.method public final f()Lrs;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lbp;->m:Z

    .line 2
    .line 3
    iget-object p0, p0, Lbp;->j:Ljava/lang/Class;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Ld72;->a:Le72;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v0, Lfw1;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lfw1;-><init>(Ljava/lang/Class;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    invoke-static {p0}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
