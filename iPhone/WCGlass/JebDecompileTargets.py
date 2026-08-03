# -*- coding: utf-8 -*-
from com.pnfsoftware.jeb.client.api import IScript
from com.pnfsoftware.jeb.core.units import INativeCodeUnit
from com.pnfsoftware.jeb.core.units.code import DecompilationContext
from java.lang import Long
import codecs
import os
import re
import traceback


class JebDecompileTargets(IScript):
    def run(self, ctx):
        outdir = 'WCGlass_restored/02_key_modules_jeb'
        if not os.path.isdir(outdir):
            os.makedirs(outdir)
        status = 'WCGlass_restored/jeb_targets_status.txt'

        targets = [
            (0x2E4DD8, 'WCLGGlassPackage_decryptContainer'),
            (0x2E5CE8, 'AES256CBC_decrypt_helper'),
            (0x2E5ECC, 'WCLGGlassPackage_importGlassData'),
            (0x2E727C, 'WCLGGlassPackage_decryptedPayloadForTheme'),
            (0x2ED1F4, 'HMAC_SHA256_helper_theme'),
            (0x2F198C, 'WCLGGlassStore_buildRequest'),
            (0x2F2C2C, 'AES256CBC_generic_helper'),
            (0x2F3020, 'HMAC_SHA256_helper_store'),
            (0x2F3140, 'WCLGGlassStore_decryptResponse'),
            (0x2FA730, 'WCLGGlassStore_glassSignKey'),
            (0x2FA73C, 'WCLGGlassStore_glassMasterKey'),
        ]

        def log(s):
            f = codecs.open(status, 'a', 'utf-8')
            f.write(unicode(s) + u'\n')
            f.close()

        try:
            project = ctx.getMainProject()
            unit = project.findUnit(INativeCodeUnit)
            decompiler = unit.getDecompiler()
            log('START targets=%d' % len(targets))
            for address, name in targets:
                method = unit.getInternalMethod(address)
                if method is None:
                    log('MISS 0x%X %s' % (address, name))
                    continue
                dc = DecompilationContext(0, Long(60000), Long(120000))
                source_unit = decompiler.decompileToUnit(method, dc)
                if source_unit is None:
                    log('FAIL 0x%X %s errors=%s' % (address, name, dc.getErrorMap()))
                    continue
                source = source_unit.getSource()
                fn = '%02d_0x%X_%s.c' % (targets.index((address, name)) + 1, address, name)
                f = codecs.open(os.path.join(outdir, fn), 'w', 'utf-8')
                f.write(u'/* Restored from WCGlass.dylib; address 0x%X */\n\n' % address)
                f.write(unicode(source))
                f.close()
                log('OK 0x%X %s chars=%d' % (address, name, len(source)))
            log('END')
        except Exception, e:
            log('ERROR %s' % e)
            log(traceback.format_exc())
            raise
