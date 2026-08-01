.class public final Lxhss/ᛵᛲᛸᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᛳᲁᲇᲀ;

.field public final ᛳᲁᲇᛸ:Ljava/util/List;

.field public final ᛷᛵᛵᲈ:Lxhss/ᛶᲈᛴ;

.field public final ᲇᛴᲇᛵ:Lxhss/ᛴᛷᛱ;


# direct methods
.method public constructor <init>(Lxhss/ᛶᲈᛴ;Lxhss/ᛳᲁᲇᲀ;Ljava/util/List;Lxhss/ᛱᛳᲇᛶ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛵᛲᛸᛲ;->ᛷᛵᛵᲈ:Lxhss/ᛶᲈᛴ;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᛵᛲᛸᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛳᲁᲇᲀ;

    .line 7
    .line 8
    iput-object p3, p0, Lxhss/ᛵᛲᛸᛲ;->ᛳᲁᲇᛸ:Ljava/util/List;

    .line 9
    .line 10
    new-instance p1, Lxhss/ᛲᛶᲀᛲ;

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    invoke-direct {p1, p2, p4}, Lxhss/ᛲᛶᲀᛲ;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    new-instance p2, Lxhss/ᛴᛷᛱ;

    .line 17
    .line 18
    invoke-direct {p2, p1}, Lxhss/ᛴᛷᛱ;-><init>(Lxhss/ᛱᛳᲇᛶ;)V

    .line 19
    .line 20
    .line 21
    iput-object p2, p0, Lxhss/ᛵᛲᛸᛲ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛷᛱ;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lxhss/ᛵᛲᛸᛲ;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Lxhss/ᛵᛲᛸᛲ;

    .line 6
    .line 7
    iget-object v0, p1, Lxhss/ᛵᛲᛸᛲ;->ᛷᛵᛵᲈ:Lxhss/ᛶᲈᛴ;

    .line 8
    .line 9
    iget-object v1, p0, Lxhss/ᛵᛲᛸᛲ;->ᛷᛵᛵᲈ:Lxhss/ᛶᲈᛴ;

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget-object v0, p1, Lxhss/ᛵᛲᛸᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛳᲁᲇᲀ;

    .line 14
    .line 15
    iget-object v1, p0, Lxhss/ᛵᛲᛸᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛳᲁᲇᲀ;

    .line 16
    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p1}, Lxhss/ᛵᛲᛸᛲ;->ᛷᛵᛵᲈ()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p0}, Lxhss/ᛵᛲᛸᛲ;->ᛷᛵᛵᲈ()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v0, v1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object p1, p1, Lxhss/ᛵᛲᛸᛲ;->ᛳᲁᲇᛸ:Ljava/util/List;

    .line 35
    .line 36
    iget-object p0, p0, Lxhss/ᛵᛲᛸᛲ;->ᛳᲁᲇᛸ:Ljava/util/List;

    .line 37
    .line 38
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    const/4 p0, 0x1

    .line 45
    return p0

    .line 46
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 47
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lxhss/ᛵᛲᛸᛲ;->ᛷᛵᛵᲈ:Lxhss/ᛶᲈᛴ;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit16 v0, v0, 0x20f

    .line 8
    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Lxhss/ᛵᛲᛸᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛳᲁᲇᲀ;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    invoke-virtual {p0}, Lxhss/ᛵᛲᛸᛲ;->ᛷᛵᛵᲈ()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    add-int/2addr v0, v1

    .line 29
    mul-int/lit8 v0, v0, 0x1f

    .line 30
    .line 31
    iget-object p0, p0, Lxhss/ᛵᛲᛸᛲ;->ᛳᲁᲇᛸ:Ljava/util/List;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    add-int/2addr p0, v0

    .line 38
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lxhss/ᛵᛲᛸᛲ;->ᛷᛵᛵᲈ()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-static {v0}, Lxhss/ᛳᛲᲈᲁ;->ᲁᛴᛴᛸ(Ljava/lang/Iterable;)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/security/cert/Certificate;

    .line 29
    .line 30
    instance-of v3, v2, Ljava/security/cert/X509Certificate;

    .line 31
    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    check-cast v2, Ljava/security/cert/X509Certificate;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    invoke-virtual {v2}, Ljava/security/cert/Certificate;->getType()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :goto_1
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    new-instance v1, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string v2, "Handshake{tlsVersion="

    .line 60
    .line 61
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-object v2, p0, Lxhss/ᛵᛲᛸᛲ;->ᛷᛵᛵᲈ:Lxhss/ᛶᲈᛴ;

    .line 65
    .line 66
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v2, " cipherSuite="

    .line 70
    .line 71
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    iget-object v2, p0, Lxhss/ᛵᛲᛸᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛳᲁᲇᲀ;

    .line 75
    .line 76
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v2, " peerCertificates="

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v0, " localCertificates="

    .line 88
    .line 89
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    new-instance v0, Ljava/util/ArrayList;

    .line 93
    .line 94
    iget-object p0, p0, Lxhss/ᛵᛲᛸᛲ;->ᛳᲁᲇᛸ:Ljava/util/List;

    .line 95
    .line 96
    invoke-static {p0}, Lxhss/ᛳᛲᲈᲁ;->ᲁᛴᛴᛸ(Ljava/lang/Iterable;)I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 101
    .line 102
    .line 103
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_3

    .line 112
    .line 113
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    check-cast v2, Ljava/security/cert/Certificate;

    .line 118
    .line 119
    instance-of v3, v2, Ljava/security/cert/X509Certificate;

    .line 120
    .line 121
    if-eqz v3, :cond_2

    .line 122
    .line 123
    check-cast v2, Ljava/security/cert/X509Certificate;

    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    goto :goto_3

    .line 134
    :cond_2
    invoke-virtual {v2}, Ljava/security/cert/Certificate;->getType()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    :goto_3
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_3
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const/16 p0, 0x7d

    .line 146
    .line 147
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    return-object p0
.end method

.method public final ᛷᛵᛵᲈ()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛵᛲᛸᛲ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛷᛱ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    return-object p0
.end method
