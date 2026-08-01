.class public final synthetic L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰苏世子哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世哲子苏楪兰/飘花落叶言子世楪哲兰苏;


# static fields
.field private static final descriptor:L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;

.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰苏世子哲;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰苏世子哲;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰苏世子哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰苏世子哲;

    .line 7
    .line 8
    new-instance v1, L飘花落叶言世哲子苏楪兰/飘花落叶言子苏楪兰哲世;

    .line 9
    .line 10
    const-string v2, "io.modelcontextprotocol.kotlin.sdk.ServerCapabilities.Resources"

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    invoke-direct {v1, v2, v0, v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子苏楪兰哲世;-><init>(Ljava/lang/String;L飘花落叶言世哲子苏楪兰/飘花落叶言子世楪哲兰苏;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "subscribe"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "listChanged"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    sput-object v1, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰苏世子哲;->descriptor:L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final childSerializers()[L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;
    .locals 3

    .line 1
    sget-object p0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子世楪兰苏哲(L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;)L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子世楪兰苏哲(L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;)L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v1, 0x2

    .line 12
    new-array v1, v1, [L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    aput-object v0, v1, v2

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    aput-object p0, v1, v0

    .line 19
    .line 20
    return-object v1
.end method

.method public final deserialize(L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰苏世子哲;->descriptor:L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    invoke-interface {p1, p0}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;)L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v0

    .line 14
    move v4, v1

    .line 15
    move-object v5, v2

    .line 16
    move-object v6, v5

    .line 17
    :goto_0
    if-eqz v3, :cond_3

    .line 18
    .line 19
    invoke-interface {p1, p0}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;)I

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    const/4 v8, -0x1

    .line 24
    if-eq v7, v8, :cond_2

    .line 25
    .line 26
    if-eqz v7, :cond_1

    .line 27
    .line 28
    if-ne v7, v0, :cond_0

    .line 29
    .line 30
    sget-object v7, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;

    .line 31
    .line 32
    invoke-interface {p1, p0, v0, v7, v6}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世兰苏哲楪(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;IL飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    check-cast v6, Ljava/lang/Boolean;

    .line 37
    .line 38
    or-int/lit8 v4, v4, 0x2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-static {v7}, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰(I)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_1
    sget-object v7, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;

    .line 46
    .line 47
    invoke-interface {p1, p0, v1, v7, v5}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世兰苏哲楪(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;IL飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    check-cast v5, Ljava/lang/Boolean;

    .line 52
    .line 53
    or-int/lit8 v4, v4, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    move v3, v1

    .line 57
    goto :goto_0

    .line 58
    :cond_3
    invoke-interface {p1, p0}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;)V

    .line 59
    .line 60
    .line 61
    new-instance p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰苏哲子世;

    .line 62
    .line 63
    invoke-direct {p0, v4, v5, v6}, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰苏哲子世;-><init>(ILjava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 64
    .line 65
    .line 66
    return-object p0
.end method

.method public final getDescriptor()L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰苏世子哲;->descriptor:L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰苏哲子世;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰苏世子哲;->descriptor:L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;

    .line 7
    .line 8
    invoke-interface {p1, p0}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;)L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏兰哲;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;

    .line 13
    .line 14
    iget-object v1, p2, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰苏哲子世;->飘花落叶言子楪世苏哲兰:Ljava/lang/Boolean;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-interface {p1, p0, v2, v0, v1}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰哲苏世(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;IL飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    iget-object p2, p2, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰苏哲子世;->飘花落叶言子楪世苏兰哲:Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-interface {p1, p0, v1, v0, p2}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰哲苏世(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;IL飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, p0}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final typeParametersSerializers()[L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世哲子苏楪兰/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪世苏兰哲:[L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object p0
.end method
