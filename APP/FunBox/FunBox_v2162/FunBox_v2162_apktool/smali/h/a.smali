.class public final enum Lh/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:Lh/a;

.field public static final enum b:Lh/a;

.field public static final enum c:Lh/a;

.field public static final enum d:Lh/a;

.field public static final enum e:Lh/a;

.field public static final enum f:Lh/a;

.field public static final enum g:Lh/a;

.field public static final enum h:Lh/a;

.field public static final enum i:Lh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lh/a;

    const-string v1, "NONE"

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lh/a;-><init>(ILjava/lang/String;)V

    sput-object v0, Lh/a;->a:Lh/a;

    new-instance v0, Lh/a;

    const-string v1, "TYPE_REF"

    const/4 v2, 0x3

    invoke-direct {v0, v2, v1}, Lh/a;-><init>(ILjava/lang/String;)V

    sput-object v0, Lh/a;->b:Lh/a;

    new-instance v0, Lh/a;

    const-string v1, "STRING_REF"

    const/4 v2, 0x4

    invoke-direct {v0, v2, v1}, Lh/a;-><init>(ILjava/lang/String;)V

    sput-object v0, Lh/a;->c:Lh/a;

    new-instance v0, Lh/a;

    const-string v1, "METHOD_REF"

    const/4 v2, 0x5

    invoke-direct {v0, v2, v1}, Lh/a;-><init>(ILjava/lang/String;)V

    sput-object v0, Lh/a;->d:Lh/a;

    new-instance v0, Lh/a;

    const-string v1, "FIELD_REF"

    const/4 v2, 0x6

    invoke-direct {v0, v2, v1}, Lh/a;-><init>(ILjava/lang/String;)V

    sput-object v0, Lh/a;->e:Lh/a;

    new-instance v0, Lh/a;

    const-string v1, "METHOD_AND_PROTO_REF"

    const/4 v2, 0x7

    invoke-direct {v0, v2, v1}, Lh/a;-><init>(ILjava/lang/String;)V

    sput-object v0, Lh/a;->f:Lh/a;

    new-instance v0, Lh/a;

    const-string v1, "CALL_SITE_REF"

    const/16 v2, 0x8

    invoke-direct {v0, v2, v1}, Lh/a;-><init>(ILjava/lang/String;)V

    sput-object v0, Lh/a;->g:Lh/a;

    new-instance v0, Lh/a;

    const-string v1, "METHOD_HANDLE_REF"

    const/16 v2, 0xc

    invoke-direct {v0, v2, v1}, Lh/a;-><init>(ILjava/lang/String;)V

    sput-object v0, Lh/a;->h:Lh/a;

    new-instance v0, Lh/a;

    const-string v1, "PROTO_REF"

    const/16 v2, 0xd

    invoke-direct {v0, v2, v1}, Lh/a;-><init>(ILjava/lang/String;)V

    sput-object v0, Lh/a;->i:Lh/a;

    return-void
.end method

.method private constructor <init>(ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method
