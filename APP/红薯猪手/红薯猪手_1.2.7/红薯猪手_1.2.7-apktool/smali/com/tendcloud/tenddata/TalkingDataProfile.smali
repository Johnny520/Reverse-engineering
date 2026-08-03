.class public Lcom/tendcloud/tenddata/TalkingDataProfile;
.super Lorg/json/JSONObject;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "name"

.field private static final b:Ljava/lang/String; = "type"

.field private static final c:Ljava/lang/String; = "gender"

.field private static final d:Ljava/lang/String; = "age"

.field private static final e:Ljava/lang/String; = "property1"

.field private static final f:Ljava/lang/String; = "property2"

.field private static final g:Ljava/lang/String; = "property3"

.field private static final h:Ljava/lang/String; = "property4"

.field private static final i:Ljava/lang/String; = "property5"

.field private static final j:Ljava/lang/String; = "property6"

.field private static final k:Ljava/lang/String; = "property7"

.field private static final l:Ljava/lang/String; = "property8"

.field private static final m:Ljava/lang/String; = "property9"

.field private static final n:Ljava/lang/String; = "property10"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    return-void
.end method

.method public static createProfile()Lcom/tendcloud/tenddata/TalkingDataProfile;
    .locals 1

    new-instance v0, Lcom/tendcloud/tenddata/TalkingDataProfile;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/TalkingDataProfile;-><init>()V

    return-object v0
.end method


# virtual methods
.method public setAge(I)Lcom/tendcloud/tenddata/TalkingDataProfile;
    .locals 1

    :try_start_0
    const-string v0, "age"

    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    const-string v0, "set age error "

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/h;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object p0
.end method

.method public setGender(Lcom/tendcloud/tenddata/TalkingDataGender;)Lcom/tendcloud/tenddata/TalkingDataProfile;
    .locals 1

    :try_start_0
    const-string v0, "gender"

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/TalkingDataGender;->index()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    const-string v0, "set gender error "

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/h;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object p0
.end method

.method public setName(Ljava/lang/String;)Lcom/tendcloud/tenddata/TalkingDataProfile;
    .locals 1

    :try_start_0
    const-string v0, "name"

    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    const-string v0, "set name error "

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/h;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object p0
.end method

.method public setProperty1(Ljava/lang/Object;)Lcom/tendcloud/tenddata/TalkingDataProfile;
    .locals 1

    :try_start_0
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    instance-of v0, p1, Ljava/lang/Number;

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "property1"

    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    const-string v0, "set property1 error "

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/h;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-object p0
.end method

.method public setProperty10(Ljava/lang/Object;)Lcom/tendcloud/tenddata/TalkingDataProfile;
    .locals 1

    :try_start_0
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    instance-of v0, p1, Ljava/lang/Number;

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "property10"

    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    const-string v0, "set property10 error "

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/h;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-object p0
.end method

.method public setProperty2(Ljava/lang/Object;)Lcom/tendcloud/tenddata/TalkingDataProfile;
    .locals 1

    :try_start_0
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    instance-of v0, p1, Ljava/lang/Number;

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "property2"

    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    const-string v0, "set property2 error "

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/h;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-object p0
.end method

.method public setProperty3(Ljava/lang/Object;)Lcom/tendcloud/tenddata/TalkingDataProfile;
    .locals 1

    :try_start_0
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    instance-of v0, p1, Ljava/lang/Number;

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "property3"

    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    const-string v0, "set property3 error "

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/h;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-object p0
.end method

.method public setProperty4(Ljava/lang/Object;)Lcom/tendcloud/tenddata/TalkingDataProfile;
    .locals 1

    :try_start_0
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    instance-of v0, p1, Ljava/lang/Number;

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "property4"

    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    const-string v0, "set property4 error "

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/h;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-object p0
.end method

.method public setProperty5(Ljava/lang/Object;)Lcom/tendcloud/tenddata/TalkingDataProfile;
    .locals 1

    :try_start_0
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    instance-of v0, p1, Ljava/lang/Number;

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "property5"

    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    const-string v0, "set property5 error "

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/h;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-object p0
.end method

.method public setProperty6(Ljava/lang/Object;)Lcom/tendcloud/tenddata/TalkingDataProfile;
    .locals 1

    :try_start_0
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    instance-of v0, p1, Ljava/lang/Number;

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "property6"

    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    const-string v0, "set property6 error "

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/h;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-object p0
.end method

.method public setProperty7(Ljava/lang/Object;)Lcom/tendcloud/tenddata/TalkingDataProfile;
    .locals 1

    :try_start_0
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    instance-of v0, p1, Ljava/lang/Number;

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "property7"

    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    const-string v0, "set property7 error "

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/h;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-object p0
.end method

.method public setProperty8(Ljava/lang/Object;)Lcom/tendcloud/tenddata/TalkingDataProfile;
    .locals 1

    :try_start_0
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    instance-of v0, p1, Ljava/lang/Number;

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "property8"

    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    const-string v0, "set property8 error "

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/h;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-object p0
.end method

.method public setProperty9(Ljava/lang/Object;)Lcom/tendcloud/tenddata/TalkingDataProfile;
    .locals 1

    :try_start_0
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    instance-of v0, p1, Ljava/lang/Number;

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "property9"

    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    const-string v0, "set property9 error "

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/h;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-object p0
.end method

.method public setType(Lcom/tendcloud/tenddata/TalkingDataProfileType;)Lcom/tendcloud/tenddata/TalkingDataProfile;
    .locals 1

    :try_start_0
    const-string v0, "type"

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/TalkingDataProfileType;->index()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    const-string v0, "set type error "

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/h;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object p0
.end method
