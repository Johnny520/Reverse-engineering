.class public final L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lretrofit2/飘花落叶言子楪哲世兰苏;


# static fields
.field public static final 飘花落叶言子楪哲兰苏世:L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰苏世哲;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Lcom/google/gson/飘花落叶言子楪哲苏兰世;

.field public final 飘花落叶言子楪哲苏兰世:Lcom/google/gson/飘花落叶言子楪苏世哲兰;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏:Lkotlin/text/Regex;

    .line 2
    .line 3
    const-string v0, "application/json; charset=UTF-8"

    .line 4
    .line 5
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰苏世哲;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰苏世哲;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lcom/google/gson/飘花落叶言子楪苏世哲兰;Lcom/google/gson/飘花落叶言子楪哲苏兰世;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Lcom/google/gson/飘花落叶言子楪苏世哲兰;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Lcom/google/gson/飘花落叶言子楪哲苏兰世;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/io/OutputStreamWriter;

    .line 7
    .line 8
    new-instance v2, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰苏哲;

    .line 9
    .line 10
    invoke-direct {v2, v0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰苏哲;-><init>(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;)V

    .line 11
    .line 12
    .line 13
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 14
    .line 15
    invoke-direct {v1, v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Lcom/google/gson/飘花落叶言子楪苏世哲兰;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Lcom/google/gson/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/io/Writer;)L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏兰哲;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object p0, p0, L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Lcom/google/gson/飘花落叶言子楪哲苏兰世;

    .line 25
    .line 26
    invoke-virtual {p0, v1, p1}, Lcom/google/gson/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰(L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏兰哲;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏兰哲;->close()V

    .line 30
    .line 31
    .line 32
    iget-wide p0, v0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 33
    .line 34
    invoke-virtual {v0, p0, p1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世兰苏(J)Lokio/ByteString;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    sget p1, L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance p1, L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪兰苏哲;

    .line 44
    .line 45
    sget-object v0, L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰苏世哲;

    .line 46
    .line 47
    invoke-direct {p1, v0, p0}, L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪兰苏哲;-><init>(L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰苏世哲;Lokio/ByteString;)V

    .line 48
    .line 49
    .line 50
    return-object p1
.end method
