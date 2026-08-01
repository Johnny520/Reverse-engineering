.class public Llin/xposed/hook/loader/config/HookItemConfig;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private bypassDefaultLoad:Ljava/lang/Boolean;

.field private enabled:Ljava/lang/Boolean;

.field private itemPath:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Llin/xposed/hook/loader/config/HookItemConfig;->enabled:Ljava/lang/Boolean;

    .line 15
    iput-object v0, p0, Llin/xposed/hook/loader/config/HookItemConfig;->bypassDefaultLoad:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 5
    .line 6
    iput-object v0, p0, Llin/xposed/hook/loader/config/HookItemConfig;->enabled:Ljava/lang/Boolean;

    .line 7
    .line 8
    iput-object v0, p0, Llin/xposed/hook/loader/config/HookItemConfig;->bypassDefaultLoad:Ljava/lang/Boolean;

    .line 9
    .line 10
    iput-object p1, p0, Llin/xposed/hook/loader/config/HookItemConfig;->itemPath:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public getBypassDefaultLoad()Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/loader/config/HookItemConfig;->bypassDefaultLoad:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public getItemPath()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/loader/config/HookItemConfig;->itemPath:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public isEnabled()Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/loader/config/HookItemConfig;->enabled:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public setBypassDefaultLoad(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/loader/config/HookItemConfig;->bypassDefaultLoad:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-void
.end method

.method public setEnabled(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/loader/config/HookItemConfig;->enabled:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-void
.end method

.method public setItemPath(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/loader/config/HookItemConfig;->itemPath:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide v1, -0x36a54c45051405a7L    # -2.3819044015843798E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Llin/xposed/hook/loader/config/HookItemConfig;->itemPath:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 v1, 0x27

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-wide v1, -0x36a54c3f051405a7L    # -2.381912568361186E45

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Llin/xposed/hook/loader/config/HookItemConfig;->enabled:Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-wide v1, -0x36a54c22051405a7L    # -2.3819520411157487E45

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-object p0, p0, Llin/xposed/hook/loader/config/HookItemConfig;->bypassDefaultLoad:Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const/16 p0, 0x7d

    .line 63
    .line 64
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method
