.class public final Ll8/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public static a(Ljava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;

    .line 8
    .line 9
    const-string v7, ""

    .line 10
    .line 11
    const-string v8, ""

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const-string v4, ""

    .line 15
    .line 16
    const-string v5, "unknown"

    .line 17
    .line 18
    sget-object v6, Ltf/t;->g:Ltf/t;

    .line 19
    .line 20
    move-object v9, v6

    .line 21
    move-object v3, p0

    .line 22
    move-object v2, p1

    .line 23
    invoke-direct/range {v0 .. v9}, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method
