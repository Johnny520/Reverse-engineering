.class public final Leb/f0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public static a(Lh/Hchat/hooks/api/model/WeChatQuoteMsg;)Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;
    .locals 14

    .line 1
    new-instance v0, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;

    .line 2
    .line 3
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->title:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->msgSource:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->sendTalker:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->displayName:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->talker:Ljava/lang/String;

    .line 12
    .line 13
    iget v6, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->type:I

    .line 14
    .line 15
    iget-object v7, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->content:Ljava/lang/String;

    .line 16
    .line 17
    iget-wide v8, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->svrId:J

    .line 18
    .line 19
    iget-object v10, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->strId:Ljava/lang/String;

    .line 20
    .line 21
    iget-wide v11, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->createTime:J

    .line 22
    .line 23
    const/4 v13, 0x0

    .line 24
    invoke-direct/range {v0 .. v13}, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;JLgg/g;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method
