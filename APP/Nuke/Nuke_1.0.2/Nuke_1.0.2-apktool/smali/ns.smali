.class public final Lns;
.super Ln21;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lms;


# instance fields
.field public final l:Lr21;


# direct methods
.method public constructor <init>(Lr21;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Loc1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lns;->l:Lr21;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ln21;->j()Lr21;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lr21;->G(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final k()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final l(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lns;->l:Lr21;

    .line 2
    .line 3
    invoke-virtual {p0}, Ln21;->j()Lr21;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p1, p0}, Lr21;->z(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method
