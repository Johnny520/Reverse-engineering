.class public final synthetic Lu8;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:Ljava/lang/String;

.field public final synthetic ζ:Lr01;

.field public final synthetic η:Lw32;

.field public final synthetic θ:I

.field public final synthetic ι:Z

.field public final synthetic κ:I

.field public final synthetic λ:I

.field public final synthetic μ:I

.field public final synthetic ν:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lr01;Lw32;IZIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu8;->ε:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lu8;->ζ:Lr01;

    .line 7
    .line 8
    iput-object p3, p0, Lu8;->η:Lw32;

    .line 9
    .line 10
    iput p4, p0, Lu8;->θ:I

    .line 11
    .line 12
    iput-boolean p5, p0, Lu8;->ι:Z

    .line 13
    .line 14
    iput p6, p0, Lu8;->κ:I

    .line 15
    .line 16
    iput p7, p0, Lu8;->λ:I

    .line 17
    .line 18
    iput p8, p0, Lu8;->μ:I

    .line 19
    .line 20
    iput p9, p0, Lu8;->ν:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, Lv80;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lu8;->μ:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lv81;->σ(I)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    iget-object v0, p0, Lu8;->ε:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p0, Lu8;->ζ:Lr01;

    .line 20
    .line 21
    iget-object v2, p0, Lu8;->η:Lw32;

    .line 22
    .line 23
    iget v3, p0, Lu8;->θ:I

    .line 24
    .line 25
    iget-boolean v4, p0, Lu8;->ι:Z

    .line 26
    .line 27
    iget v5, p0, Lu8;->κ:I

    .line 28
    .line 29
    iget v6, p0, Lu8;->λ:I

    .line 30
    .line 31
    iget v9, p0, Lu8;->ν:I

    .line 32
    .line 33
    invoke-static/range {v0 .. v9}, Lln0;->α(Ljava/lang/String;Lr01;Lw32;IZIILv80;II)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Ls62;->α:Ls62;

    .line 37
    .line 38
    return-object p0
.end method
