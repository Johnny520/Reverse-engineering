.class public abstract Lc0/J;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const-string v5, "Chats"

    const-string v6, "Contacts"

    const-string v0, "\u5fae\u4fe1"

    const-string v1, "\u901a\u8baf\u5f55"

    const-string v2, "\u53d1\u73b0"

    const-string v3, "\u6211"

    const-string v4, "WeChat"

    const-string v7, "Discover"

    const-string v8, "Me"

    filled-new-array/range {v0 .. v8}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LA0/p;->W([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lc0/J;->a:Ljava/util/Set;

    return-void
.end method
