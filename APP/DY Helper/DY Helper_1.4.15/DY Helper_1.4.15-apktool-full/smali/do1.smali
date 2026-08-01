.class public abstract Ldo1;
.super Lco1;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ln80;


# instance fields
.field public final ζ:I


# direct methods
.method public constructor <init>(Lop;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lco1;-><init>(Lop;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x2

    .line 5
    iput p1, p0, Ldo1;->ζ:I

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final getArity()I
    .locals 0

    .line 1
    iget p0, p0, Ldo1;->ζ:I

    .line 2
    .line 3
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lq8;->ε:Lop;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lvm1;->α:Lwm1;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lwm1;->α(Ln80;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-super {p0}, Lq8;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
