.class public Lcom/alibaba/fastjson2/JSONValidator;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alibaba/fastjson2/JSONValidator$Type;
    }
.end annotation


# instance fields
.field private final jsonReader:Lcom/alibaba/fastjson2/JSONReader;

.field private type:Lcom/alibaba/fastjson2/JSONValidator$Type;

.field private validateResult:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Lcom/alibaba/fastjson2/JSONReader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONValidator;->jsonReader:Lcom/alibaba/fastjson2/JSONReader;

    .line 5
    .line 6
    return-void
.end method

.method public static from(Lcom/alibaba/fastjson2/JSONReader;)Lcom/alibaba/fastjson2/JSONValidator;
    .locals 1

    .line 11
    new-instance v0, Lcom/alibaba/fastjson2/JSONValidator;

    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/JSONValidator;-><init>(Lcom/alibaba/fastjson2/JSONReader;)V

    return-object v0
.end method

.method public static from(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONValidator;
    .locals 1

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONValidator;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONReader;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/JSONValidator;-><init>(Lcom/alibaba/fastjson2/JSONReader;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static fromUtf8([B)Lcom/alibaba/fastjson2/JSONValidator;
    .locals 1

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONValidator;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSONReader;->of([B)Lcom/alibaba/fastjson2/JSONReader;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/JSONValidator;-><init>(Lcom/alibaba/fastjson2/JSONReader;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method


# virtual methods
.method public getType()Lcom/alibaba/fastjson2/JSONValidator$Type;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONValidator;->type:Lcom/alibaba/fastjson2/JSONValidator$Type;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONValidator;->validate()Z

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONValidator;->type:Lcom/alibaba/fastjson2/JSONValidator$Type;

    .line 9
    .line 10
    return-object v0
.end method

.method public validate()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONValidator;->validateResult:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONValidator;->jsonReader:Lcom/alibaba/fastjson2/JSONReader;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONValidator;->jsonReader:Lcom/alibaba/fastjson2/JSONReader;

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->skipValue()V
    :try_end_0
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONValidator;->jsonReader:Lcom/alibaba/fastjson2/JSONReader;

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    .line 24
    .line 25
    .line 26
    const/16 v1, 0x7b

    .line 27
    .line 28
    if-ne v0, v1, :cond_1

    .line 29
    .line 30
    sget-object v0, Lcom/alibaba/fastjson2/JSONValidator$Type;->Object:Lcom/alibaba/fastjson2/JSONValidator$Type;

    .line 31
    .line 32
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONValidator;->type:Lcom/alibaba/fastjson2/JSONValidator$Type;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/16 v1, 0x5b

    .line 36
    .line 37
    if-ne v0, v1, :cond_2

    .line 38
    .line 39
    sget-object v0, Lcom/alibaba/fastjson2/JSONValidator$Type;->Array:Lcom/alibaba/fastjson2/JSONValidator$Type;

    .line 40
    .line 41
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONValidator;->type:Lcom/alibaba/fastjson2/JSONValidator$Type;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    sget-object v0, Lcom/alibaba/fastjson2/JSONValidator$Type;->Value:Lcom/alibaba/fastjson2/JSONValidator$Type;

    .line 45
    .line 46
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONValidator;->type:Lcom/alibaba/fastjson2/JSONValidator$Type;

    .line 47
    .line 48
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONValidator;->jsonReader:Lcom/alibaba/fastjson2/JSONReader;

    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->isEnd()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iput-object v1, p0, Lcom/alibaba/fastjson2/JSONValidator;->validateResult:Ljava/lang/Boolean;

    .line 59
    .line 60
    return v0

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    goto :goto_1

    .line 63
    :catch_0
    :try_start_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 64
    .line 65
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONValidator;->validateResult:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONValidator;->jsonReader:Lcom/alibaba/fastjson2/JSONReader;

    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    .line 70
    .line 71
    .line 72
    const/4 v0, 0x0

    .line 73
    return v0

    .line 74
    :goto_1
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONValidator;->jsonReader:Lcom/alibaba/fastjson2/JSONReader;

    .line 75
    .line 76
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    .line 77
    .line 78
    .line 79
    throw v0
.end method
