.class public final synthetic Lr0/B;
.super LN0/f;
.source "SourceFile"

# interfaces
.implements LM0/l;


# static fields
.field public static final i:Lr0/B;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lr0/B;

    .line 2
    .line 3
    const-string v1, "trim(Ljava/lang/String;)Ljava/lang/String;"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const-class v3, LU0/i;

    .line 7
    .line 8
    const-string v4, "trim"

    .line 9
    .line 10
    invoke-direct {v0, v3, v4, v1, v2}, LN0/f;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lr0/B;->i:Lr0/B;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "p0"

    .line 4
    .line 5
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
