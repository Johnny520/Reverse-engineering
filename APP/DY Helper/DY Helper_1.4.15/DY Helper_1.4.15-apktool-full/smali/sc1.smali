.class public final synthetic Lsc1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:Ljava/lang/String;

.field public final synthetic ζ:Ljava/lang/String;

.field public final synthetic η:J

.field public final synthetic θ:Ljava/lang/Integer;

.field public final synthetic ι:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsc1;->ε:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lsc1;->ζ:Ljava/lang/String;

    .line 7
    .line 8
    iput-wide p3, p0, Lsc1;->η:J

    .line 9
    .line 10
    iput-object p5, p0, Lsc1;->θ:Ljava/lang/Integer;

    .line 11
    .line 12
    iput-object p6, p0, Lsc1;->ι:Ljava/lang/String;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    check-cast p2, Lwc1;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    new-instance v0, Lwc1;

    .line 11
    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v7, 0x0

    .line 14
    iget-object v1, p0, Lsc1;->ε:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v2, p0, Lsc1;->ζ:Ljava/lang/String;

    .line 17
    .line 18
    const-string v3, "{}"

    .line 19
    .line 20
    sget-object v4, Ljz;->ε:Ljz;

    .line 21
    .line 22
    iget-wide v5, p0, Lsc1;->η:J

    .line 23
    .line 24
    invoke-direct/range {v0 .. v8}, Lwc1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JLjava/lang/Integer;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    move-object p2, v0

    .line 28
    :cond_0
    iget-object v1, p2, Lwc1;->α:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v2, p2, Lwc1;->β:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v3, p2, Lwc1;->γ:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v4, p2, Lwc1;->δ:Ljava/util/List;

    .line 35
    .line 36
    iget-wide v5, p2, Lwc1;->ε:J

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance v0, Lwc1;

    .line 51
    .line 52
    iget-object v7, p0, Lsc1;->θ:Ljava/lang/Integer;

    .line 53
    .line 54
    iget-object v8, p0, Lsc1;->ι:Ljava/lang/String;

    .line 55
    .line 56
    invoke-direct/range {v0 .. v8}, Lwc1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JLjava/lang/Integer;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v0
.end method
