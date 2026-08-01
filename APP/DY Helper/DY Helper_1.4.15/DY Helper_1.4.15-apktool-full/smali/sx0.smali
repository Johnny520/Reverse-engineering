.class public final synthetic Lsx0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:Landroid/app/Activity;

.field public final synthetic ζ:Ldy;

.field public final synthetic η:Lwy;

.field public final synthetic θ:Lfv;

.field public final synthetic ι:I

.field public final synthetic κ:Z

.field public final synthetic λ:Ln;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ldy;Lwy;Lfv;IZLn;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsx0;->ε:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p2, p0, Lsx0;->ζ:Ldy;

    .line 7
    .line 8
    iput-object p3, p0, Lsx0;->η:Lwy;

    .line 9
    .line 10
    iput-object p4, p0, Lsx0;->θ:Lfv;

    .line 11
    .line 12
    iput p5, p0, Lsx0;->ι:I

    .line 13
    .line 14
    iput-boolean p6, p0, Lsx0;->κ:Z

    .line 15
    .line 16
    iput-object p7, p0, Lsx0;->λ:Ln;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, Ljava/lang/String;

    .line 3
    .line 4
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lvx0;

    .line 8
    .line 9
    iget-object v1, p0, Lsx0;->ε:Landroid/app/Activity;

    .line 10
    .line 11
    iget-object v2, p0, Lsx0;->ζ:Ldy;

    .line 12
    .line 13
    iget-object v3, p0, Lsx0;->η:Lwy;

    .line 14
    .line 15
    iget-object v5, p0, Lsx0;->θ:Lfv;

    .line 16
    .line 17
    iget v6, p0, Lsx0;->ι:I

    .line 18
    .line 19
    iget-boolean v7, p0, Lsx0;->κ:Z

    .line 20
    .line 21
    iget-object v8, p0, Lsx0;->λ:Ln;

    .line 22
    .line 23
    invoke-direct/range {v0 .. v8}, Lvx0;-><init>(Landroid/app/Activity;Ldy;Lwy;Ljava/lang/String;Lfv;IZLn;)V

    .line 24
    .line 25
    .line 26
    const/16 p0, 0x17

    .line 27
    .line 28
    const-string p1, "dl-comment-emoji"

    .line 29
    .line 30
    invoke-static {p0, v0, p1}, Lp91;->Ζ(ILp70;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Ls62;->α:Ls62;

    .line 34
    .line 35
    return-object p0
.end method
