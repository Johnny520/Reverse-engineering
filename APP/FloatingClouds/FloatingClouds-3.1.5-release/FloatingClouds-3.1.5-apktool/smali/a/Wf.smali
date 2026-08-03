.class public final La/Wf;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/Wf;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La/Wf;

    invoke-direct {v0}, La/Wf;-><init>()V

    sput-object v0, La/Wf;->a:La/Wf;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "kotlin.Unit"

    return-object v0
.end method
