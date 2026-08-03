.class public final LYue/ۥ۟ۤۤ۠;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:LYue/ۥ۟ۤۤ۠;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟:Ljava/nio/charset/Charset;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟:Ljava/nio/charset/Charset;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟:Ljava/nio/charset/Charset;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟۟:Ljava/nio/charset/Charset;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟۠:Ljava/nio/charset/Charset;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۡ:Ljava/nio/charset/Charset;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static volatile ۥ۟۟۟ۢ:Ljava/nio/charset/Charset;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public static volatile ۥۣ۟۟۟:Ljava/nio/charset/Charset;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public static volatile ۥ۟۟۟ۤ:Ljava/nio/charset/Charset;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥ۟ۤۤ۠;

    invoke-direct {v0}, LYue/ۥ۟ۤۤ۠;-><init>()V

    sput-object v0, LYue/ۥ۟ۤۤ۠;->ۥ:LYue/ۥ۟ۤۤ۠;

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    const-string v1, "forName(\"UTF-8\")"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LYue/ۥ۟ۤۤ۠;->ۥ۟:Ljava/nio/charset/Charset;

    const-string v0, "UTF-16"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    const-string v1, "forName(\"UTF-16\")"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LYue/ۥ۟ۤۤ۠;->ۥ۟۟:Ljava/nio/charset/Charset;

    const-string v0, "UTF-16BE"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    const-string v1, "forName(\"UTF-16BE\")"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LYue/ۥ۟ۤۤ۠;->ۥ۟۟۟:Ljava/nio/charset/Charset;

    const-string v0, "UTF-16LE"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    const-string v1, "forName(\"UTF-16LE\")"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LYue/ۥ۟ۤۤ۠;->ۥ۟۟۟۟:Ljava/nio/charset/Charset;

    const-string v0, "US-ASCII"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    const-string v1, "forName(\"US-ASCII\")"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LYue/ۥ۟ۤۤ۠;->ۥ۟۟۟۠:Ljava/nio/charset/Charset;

    const-string v0, "ISO-8859-1"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    const-string v1, "forName(\"ISO-8859-1\")"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LYue/ۥ۟ۤۤ۠;->ۥ۟۟۟ۡ:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/nio/charset/Charset;
    .locals 2
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "UTF32"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۟ۤۤ۠;->ۥ۟۟۟ۢ:Ljava/nio/charset/Charset;

    if-nez v0, :cond_0

    const-string v0, "UTF-32"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    const-string v1, "forName(\"UTF-32\")"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LYue/ۥ۟ۤۤ۠;->ۥ۟۟۟ۢ:Ljava/nio/charset/Charset;

    :cond_0
    return-object v0
.end method

.method public final ۥ۟()Ljava/nio/charset/Charset;
    .locals 2
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "UTF32_BE"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۟ۤۤ۠;->ۥ۟۟۟ۤ:Ljava/nio/charset/Charset;

    if-nez v0, :cond_0

    const-string v0, "UTF-32BE"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    const-string v1, "forName(\"UTF-32BE\")"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LYue/ۥ۟ۤۤ۠;->ۥ۟۟۟ۤ:Ljava/nio/charset/Charset;

    :cond_0
    return-object v0
.end method

.method public final ۥ۟۟()Ljava/nio/charset/Charset;
    .locals 2
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "UTF32_LE"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۟ۤۤ۠;->ۥۣ۟۟۟:Ljava/nio/charset/Charset;

    if-nez v0, :cond_0

    const-string v0, "UTF-32LE"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    const-string v1, "forName(\"UTF-32LE\")"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LYue/ۥ۟ۤۤ۠;->ۥۣ۟۟۟:Ljava/nio/charset/Charset;

    :cond_0
    return-object v0
.end method
