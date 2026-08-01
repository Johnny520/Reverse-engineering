.class public final Lp;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Lx;

.field public final β:Ljavax/net/SocketFactory;

.field public final γ:Ljavax/net/ssl/SSLSocketFactory;

.field public final δ:Ljavax/net/ssl/HostnameVerifier;

.field public final ε:Lje;

.field public final ζ:Lx;

.field public final η:Ljava/net/ProxySelector;

.field public final θ:Log0;

.field public final ι:Ljava/util/List;

.field public final κ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILx;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Lr41;Lje;Lx;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p3, p0, Lp;->α:Lx;

    .line 26
    .line 27
    iput-object p4, p0, Lp;->β:Ljavax/net/SocketFactory;

    .line 28
    .line 29
    iput-object p5, p0, Lp;->γ:Ljavax/net/ssl/SSLSocketFactory;

    .line 30
    .line 31
    iput-object p6, p0, Lp;->δ:Ljavax/net/ssl/HostnameVerifier;

    .line 32
    .line 33
    iput-object p7, p0, Lp;->ε:Lje;

    .line 34
    .line 35
    iput-object p8, p0, Lp;->ζ:Lx;

    .line 36
    .line 37
    iput-object p11, p0, Lp;->η:Ljava/net/ProxySelector;

    .line 38
    .line 39
    new-instance p3, Lng0;

    .line 40
    .line 41
    invoke-direct {p3}, Lng0;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string p4, "http"

    .line 45
    .line 46
    const-string p6, "https"

    .line 47
    .line 48
    if-eqz p5, :cond_0

    .line 49
    .line 50
    move-object p5, p6

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move-object p5, p4

    .line 53
    :goto_0
    invoke-virtual {p5, p4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result p7

    .line 57
    if-eqz p7, :cond_1

    .line 58
    .line 59
    iput-object p4, p3, Lng0;->α:Ljava/lang/String;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    invoke-virtual {p5, p6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result p4

    .line 66
    if-eqz p4, :cond_4

    .line 67
    .line 68
    iput-object p6, p3, Lng0;->α:Ljava/lang/String;

    .line 69
    .line 70
    :goto_1
    const/4 p4, 0x7

    .line 71
    const/4 p5, 0x0

    .line 72
    invoke-static {p5, p5, p4, p1}, Lbd;->Κ(IIILjava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p4

    .line 76
    invoke-static {p4}, Lqd2;->β(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p4

    .line 80
    if-eqz p4, :cond_3

    .line 81
    .line 82
    iput-object p4, p3, Lng0;->δ:Ljava/lang/String;

    .line 83
    .line 84
    const/4 p1, 0x1

    .line 85
    if-gt p1, p2, :cond_2

    .line 86
    .line 87
    const/high16 p1, 0x10000

    .line 88
    .line 89
    if-ge p2, p1, :cond_2

    .line 90
    .line 91
    iput p2, p3, Lng0;->ε:I

    .line 92
    .line 93
    invoke-virtual {p3}, Lng0;->α()Log0;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iput-object p1, p0, Lp;->θ:Log0;

    .line 98
    .line 99
    invoke-static {p9}, Lud2;->ι(Ljava/util/List;)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    iput-object p1, p0, Lp;->ι:Ljava/util/List;

    .line 104
    .line 105
    invoke-static {p10}, Lud2;->ι(Ljava/util/List;)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    iput-object p1, p0, Lp;->κ:Ljava/util/List;

    .line 110
    .line 111
    return-void

    .line 112
    :cond_2
    const-string p0, "unexpected port: "

    .line 113
    .line 114
    invoke-static {p0, p2}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-static {p0}, Lγ;->δ(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    const/4 p0, 0x0

    .line 122
    throw p0

    .line 123
    :cond_3
    const-string p0, "unexpected host: "

    .line 124
    .line 125
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    const/4 p0, 0x0

    .line 133
    throw p0

    .line 134
    :cond_4
    const-string p0, "unexpected scheme: "

    .line 135
    .line 136
    invoke-virtual {p0, p5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    const/4 p0, 0x0

    .line 144
    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lp;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lp;

    .line 6
    .line 7
    iget-object v0, p1, Lp;->θ:Log0;

    .line 8
    .line 9
    iget-object v1, p0, Lp;->θ:Log0;

    .line 10
    .line 11
    invoke-static {v1, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lp;->α(Lp;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lp;->θ:Log0;

    .line 2
    .line 3
    iget-object v0, v0, Log0;->θ:Ljava/lang/String;

    .line 4
    .line 5
    const/16 v1, 0x20f

    .line 6
    .line 7
    const/16 v2, 0x1f

    .line 8
    .line 9
    invoke-static {v1, v2, v0}, La12;->β(IILjava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, Lp;->α:Lx;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v1, v0

    .line 20
    mul-int/2addr v1, v2

    .line 21
    iget-object v0, p0, Lp;->ζ:Lx;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    add-int/2addr v0, v1

    .line 28
    mul-int/2addr v0, v2

    .line 29
    iget-object v1, p0, Lp;->ι:Ljava/util/List;

    .line 30
    .line 31
    invoke-static {v1, v0, v2}, La12;->γ(Ljava/util/List;II)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-object v1, p0, Lp;->κ:Ljava/util/List;

    .line 36
    .line 37
    invoke-static {v1, v0, v2}, La12;->γ(Ljava/util/List;II)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-object v1, p0, Lp;->η:Ljava/net/ProxySelector;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-int/2addr v1, v0

    .line 48
    mul-int/lit16 v1, v1, 0x3c1

    .line 49
    .line 50
    iget-object v0, p0, Lp;->γ:Ljavax/net/ssl/SSLSocketFactory;

    .line 51
    .line 52
    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    add-int/2addr v0, v1

    .line 57
    mul-int/2addr v0, v2

    .line 58
    iget-object v1, p0, Lp;->δ:Ljavax/net/ssl/HostnameVerifier;

    .line 59
    .line 60
    invoke-static {v1}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    add-int/2addr v1, v0

    .line 65
    mul-int/2addr v1, v2

    .line 66
    iget-object p0, p0, Lp;->ε:Lje;

    .line 67
    .line 68
    invoke-static {p0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    add-int/2addr p0, v1

    .line 73
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Address{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lp;->θ:Log0;

    .line 9
    .line 10
    iget-object v2, v1, Log0;->δ:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/16 v2, 0x3a

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget v1, v1, Log0;->ε:I

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ", "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v2, "proxySelector="

    .line 33
    .line 34
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, Lp;->η:Ljava/net/ProxySelector;

    .line 38
    .line 39
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const/16 p0, 0x7d

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method public final α(Lp;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lp;->α:Lx;

    .line 5
    .line 6
    iget-object v1, p1, Lp;->α:Lx;

    .line 7
    .line 8
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lp;->ζ:Lx;

    .line 15
    .line 16
    iget-object v1, p1, Lp;->ζ:Lx;

    .line 17
    .line 18
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lp;->ι:Ljava/util/List;

    .line 25
    .line 26
    iget-object v1, p1, Lp;->ι:Ljava/util/List;

    .line 27
    .line 28
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    iget-object v0, p0, Lp;->κ:Ljava/util/List;

    .line 35
    .line 36
    iget-object v1, p1, Lp;->κ:Ljava/util/List;

    .line 37
    .line 38
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    iget-object v0, p0, Lp;->η:Ljava/net/ProxySelector;

    .line 45
    .line 46
    iget-object v1, p1, Lp;->η:Ljava/net/ProxySelector;

    .line 47
    .line 48
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    iget-object v0, p0, Lp;->γ:Ljavax/net/ssl/SSLSocketFactory;

    .line 55
    .line 56
    iget-object v1, p1, Lp;->γ:Ljavax/net/ssl/SSLSocketFactory;

    .line 57
    .line 58
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_0

    .line 63
    .line 64
    iget-object v0, p0, Lp;->δ:Ljavax/net/ssl/HostnameVerifier;

    .line 65
    .line 66
    iget-object v1, p1, Lp;->δ:Ljavax/net/ssl/HostnameVerifier;

    .line 67
    .line 68
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_0

    .line 73
    .line 74
    iget-object v0, p0, Lp;->ε:Lje;

    .line 75
    .line 76
    iget-object v1, p1, Lp;->ε:Lje;

    .line 77
    .line 78
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_0

    .line 83
    .line 84
    iget-object p0, p0, Lp;->θ:Log0;

    .line 85
    .line 86
    iget p0, p0, Log0;->ε:I

    .line 87
    .line 88
    iget-object p1, p1, Lp;->θ:Log0;

    .line 89
    .line 90
    iget p1, p1, Log0;->ε:I

    .line 91
    .line 92
    if-ne p0, p1, :cond_0

    .line 93
    .line 94
    const/4 p0, 0x1

    .line 95
    return p0

    .line 96
    :cond_0
    const/4 p0, 0x0

    .line 97
    return p0
.end method
