.class public final La/s4$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/s4$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/s4$a$a$a;
    }
.end annotation


# static fields
.field public static final a:La/s4$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La/s4$a$a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/s4$a$a;->a:La/s4$a$a;

    return-void
.end method

.method public static a(La/s4$a$a$a;)Z
    .locals 2

    sget-object v0, La/x8;->a:La/x8;

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    const/4 v0, 0x1

    if-eqz p0, :cond_2

    if-eq p0, v0, :cond_1

    const/4 v1, 0x2

    if-ne p0, v1, :cond_0

    sget-object p0, La/ca$b;->c:La/ca$b;

    goto :goto_0

    :cond_0
    new-instance p0, La/Ob;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, La/ca$b;->b:La/ca$b;

    goto :goto_0

    :cond_2
    sget-object p0, La/ca$b;->a:La/ca$b;

    :goto_0
    sget-object v1, La/x8;->b:La/ca$b;

    if-ne v1, p0, :cond_3

    return v0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    sget-object v0, La/x8;->a:La/x8;

    sget-object v0, La/x8;->b:La/ca$b;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
