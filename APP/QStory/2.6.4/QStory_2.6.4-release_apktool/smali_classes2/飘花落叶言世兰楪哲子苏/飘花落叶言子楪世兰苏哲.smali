.class public final L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世兰苏哲;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世兰苏哲;

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰世楪哲苏(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, v0, v2}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世兰苏哲;-><init>(Ljava/util/Set;Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;)V

    .line 14
    .line 15
    .line 16
    sput-object v1, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世兰苏哲;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Ljava/util/Set;Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/util/Set;

    .line 8
    .line 9
    iput-object p2, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世兰苏哲;

    .line 6
    .line 7
    iget-object v0, p1, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/util/Set;

    .line 8
    .line 9
    iget-object v1, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/util/Set;

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;

    .line 18
    .line 19
    iget-object p0, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;

    .line 20
    .line 21
    invoke-static {p1, p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/util/Set;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit16 v0, v0, 0x5ed

    .line 8
    .line 9
    mul-int/lit8 v0, v0, 0x29

    .line 10
    .line 11
    iget-object p0, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    :goto_0
    add-int/2addr v0, p0

    .line 22
    return v0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/util/Set;

    .line 5
    .line 6
    check-cast p0, Ljava/lang/Iterable;

    .line 7
    .line 8
    sget-object v0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 9
    .line 10
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_6

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-interface {p2}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Ljava/security/cert/X509Certificate;

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-static {v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏世兰(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    throw p0

    .line 65
    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v1, "Certificate pinning failure!\n  Peer certificate chain:"

    .line 68
    .line 69
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_3

    .line 81
    .line 82
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    check-cast v1, Ljava/security/cert/X509Certificate;

    .line 87
    .line 88
    const-string v2, "\n    "

    .line 89
    .line 90
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-static {v1}, Lkotlin/collections/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪兰苏哲(Ljava/security/cert/X509Certificate;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v2, ": "

    .line 101
    .line 102
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-interface {v1}, Ljava/security/Principal;->getName()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_3
    const-string p0, "\n  Pinned certificates for "

    .line 118
    .line 119
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string p0, ":"

    .line 126
    .line 127
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-eqz p1, :cond_5

    .line 139
    .line 140
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    if-nez p1, :cond_4

    .line 145
    .line 146
    const-string p1, "\n    null"

    .line 147
    .line 148
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_4
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :cond_5
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    new-instance p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 161
    .line 162
    invoke-direct {p1, p0}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw p1

    .line 166
    :cond_6
    invoke-static {p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏世兰(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    throw p0
.end method
