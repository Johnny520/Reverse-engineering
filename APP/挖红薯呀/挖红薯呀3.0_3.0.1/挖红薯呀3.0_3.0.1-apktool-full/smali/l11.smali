.class public final synthetic Ll11;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lio/github/libxposed/api/XposedInterface$Hooker;


# instance fields
.field public final synthetic a:Ljava/lang/Class;

.field public final synthetic b:Ljava/lang/Class;

.field public final synthetic c:Ljava/lang/Class;

.field public final synthetic d:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll11;->a:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, Ll11;->b:Ljava/lang/Class;

    .line 7
    .line 8
    iput-object p3, p0, Ll11;->c:Ljava/lang/Class;

    .line 9
    .line 10
    iput-object p4, p0, Ll11;->d:Ljava/lang/Class;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final intercept(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ll11;->c:Ljava/lang/Class;

    .line 2
    .line 3
    iget-object v1, p0, Ll11;->d:Ljava/lang/Class;

    .line 4
    .line 5
    iget-object v2, p0, Ll11;->a:Ljava/lang/Class;

    .line 6
    .line 7
    iget-object p0, p0, Ll11;->b:Ljava/lang/Class;

    .line 8
    .line 9
    invoke-static {v2, p0, v0, v1, p1}, Lm11;->a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lio/github/libxposed/api/XposedInterface$Chain;)Lna1;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
