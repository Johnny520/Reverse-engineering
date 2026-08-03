.class Lbsh/security/MainSecurityGuard$BasicSecurityGuard;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lbsh/security/SecurityGuard;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbsh/security/MainSecurityGuard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "BasicSecurityGuard"
.end annotation


# instance fields
.field final synthetic this$0:Lbsh/security/MainSecurityGuard;


# direct methods
.method private constructor <init>(Lbsh/security/MainSecurityGuard;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbsh/security/MainSecurityGuard$BasicSecurityGuard;->this$0:Lbsh/security/MainSecurityGuard;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Lbsh/security/MainSecurityGuard;I)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Lbsh/security/MainSecurityGuard$BasicSecurityGuard;-><init>(Lbsh/security/MainSecurityGuard;)V

    return-void
.end method


# virtual methods
.method public canConstruct(Ljava/lang/Class;[Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    .line 1
    const-class p2, Lbsh/security/MainSecurityGuard;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    const-class p2, Lbsh/security/SecurityGuard;

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    return v0

    .line 20
    :cond_1
    const/4 p1, 0x1

    .line 21
    return p1
.end method

.method public canGetStaticField(Ljava/lang/Class;Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")Z"
        }
    .end annotation

    .line 1
    const-class v0, Lbsh/Interpreter;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const-string p1, "mainSecurityGuard"

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, 0x1

    .line 16
    return p1
.end method

.method public canImplements(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    const-class v0, Lbsh/security/SecurityGuard;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    return p1

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    return p1
.end method

.method public canInvokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Lbsh/security/MainSecurityGuard;

    .line 2
    .line 3
    xor-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    return p1
.end method

.method public canSetField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Lbsh/security/MainSecurityGuard;

    .line 2
    .line 3
    xor-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    return p1
.end method

.method public canSetStaticField(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    .line 1
    const-class p3, Lbsh/Interpreter;

    .line 2
    .line 3
    if-ne p1, p3, :cond_0

    .line 4
    .line 5
    const-string p1, "mainSecurityGuard"

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, 0x1

    .line 16
    return p1
.end method
