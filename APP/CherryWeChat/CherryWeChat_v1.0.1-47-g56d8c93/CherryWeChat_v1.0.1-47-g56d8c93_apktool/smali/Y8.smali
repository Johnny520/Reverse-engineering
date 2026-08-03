.class public final synthetic LY8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY8;->a:Ljava/lang/String;

    iput-boolean p2, p0, LY8;->b:Z

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LY8;->a:Ljava/lang/String;

    iget-boolean v1, p0, LY8;->b:Z

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->o0(Ljava/lang/String;Z)LTC;

    move-result-object v0

    return-object v0
.end method
